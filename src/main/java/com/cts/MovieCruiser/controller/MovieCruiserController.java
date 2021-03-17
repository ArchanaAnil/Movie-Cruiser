package com.cts.MovieCruiser.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.cts.MovieCruiser.EmptyFavoritesException;
import com.cts.MovieCruiser.Favorites;
import com.cts.MovieCruiser.FavoritesDaoImpl;
import com.cts.MovieCruiser.Movie;
import com.cts.MovieCruiser.MovieDaoImpl;
import com.cts.MovieCruiser.User;
import com.cts.MovieCruiser.service.FavoritesService;
import com.cts.MovieCruiser.service.MovieService;
import com.cts.MovieCruiser.service.UserService;

@Controller
public class MovieCruiserController {

	
	@Autowired
	MovieDaoImpl movieDaoImpl;
	@Autowired
	FavoritesDaoImpl favoritesDaoImpl;
	
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	UserService userService;

	@Autowired
	FavoritesService favoritesService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserController.class);

	/*
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String UserHomepage() {
		return "homepage";

	}

	@RequestMapping(value = "/admin")
	public String AdminHomepage(ModelMap model) {
		model.put("list", movieDaoImpl.getMovieListAdmin());
		return "movie-list-admin";
	}

	@RequestMapping(value = "/customer")
	public String CustomerHomepage(ModelMap model) {
		model.put("list", movieDaoImpl.getMovieListCustomer());
		return "movie-list-customer";
	}

	@RequestMapping(value = "/login")
	public String Login() {

		return "login";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String SignupUser(ModelMap model) {
		model.put("list", movieDaoImpl.getMovieListCustomer());
		return "movie-list-customer";
	}

	@RequestMapping(value = "/signup")
	public String Signup() {
		return "signup";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String AdminLogin(ModelMap model) {
		model.put("list", movieDaoImpl.getMovieListAdmin());
		return "movie-list-admin";
	}

	@RequestMapping("/logout")
	public String logOut(SessionStatus status) {
		status.setComplete();
		return "redirect:/login";
	}

	@RequestMapping("/add-fav")
	public String addTFav(ModelMap model, @RequestParam int id) throws EmptyFavoritesException {
		String name = (String) model.get("username");
		int flag=1;
		String str;
		List<Integer> favList = favoritesDaoImpl.getFavorites(2);
		for (Integer i : favList) 
		{
			if (i == id)
			{
				flag=0;
				break;
			}
			
		}
		if(flag==1)
		{
			favoritesDaoImpl.addFavorites(2, id);
		}
			
		List<Movie> list = movieDaoImpl.getMovieListCustomer();
		Movie Item = new Movie();
		for (Movie ele : list) {
			if (ele.getMovie_id() == id) {
				Item = ele;
			}
		}
		
		if(flag==1)
		{
			 str = Item.getTitle() + " added successfully!";
		}
		else {
			 str = Item.getTitle() + " is already present!";
		}
		
		model.put("itemId", id);
		model.put("username", name);
		model.put("list", list);
		model.put("message", str);
		return "add-fav";
	}

	@RequestMapping("/view-fav")
	public String viewFav(ModelMap model) throws EmptyFavoritesException {
		String name = (String) model.get("username");
		// int us_id = loginValidadtion.getUserId(name);
		List<Integer> list = favoritesDaoImpl.getFavorites(2);
		List<Movie> Item = new ArrayList<>();
		int total = 0;
		for (Integer ele : list) {
			List<Movie> listTemp = movieDaoImpl.getMovieListCustomer();
			for (Movie m : listTemp) {
				if (m.getMovie_id() == ele) {
					Item.add(m);
					total = total + 1;
				}
			}
		}
		model.put("list", Item);
		model.put("total", total);
		return "viewFav";
	}
	
	@RequestMapping("/viewFav")
	public String viewFavAfterDelete(ModelMap model, @RequestParam BigInteger id) throws EmptyFavoritesException {
		String name = (String) model.get("username");
		//int us_id = loginValidadtion.getUserId(name);
		favoritesDaoImpl.removeFavorites(2,id);
		List<Integer> list = favoritesDaoImpl.getFavorites(2);
		List<Movie> Item = new ArrayList<>();
		double total = 0;
		for (Integer ele : list) {
			List<Movie> listTemp = movieDaoImpl.getMovieListCustomer();
			for (Movie m : listTemp) {
				if (m.getMovie_id() == ele) {
					Item.add(m);
					total = total + 1;
				}
			}
		}
		model.put("list", Item);
		model.put("total", total);
		return "viewFav";
	}
	
	@RequestMapping(value = "/edit-movie", method = RequestMethod.GET)
	public String edit(ModelMap model, @RequestParam BigInteger id) {
	// List<MenuItem> list = menuItemDaoImpl.getMenuItemListAdmin();
	// MenuItem menuItem = menuItemDaoImpl.retreiveMenuItem(id);
	List<Movie> list = movieDaoImpl.getMovieListAdmin();
	Movie menuItem = new Movie();
	for (Movie ele : list) {
	if (ele.getMovie_id() == id) {
	menuItem = ele;
	}
	}
	model.put("menuItem", menuItem);
	model.put("id", id);
	System.out.println(id);
	return "edit-movie";
	}

	
	@RequestMapping(value = "/edit-movie", method = RequestMethod.POST)
	public String EditMenuSuccess(ModelMap model, @RequestParam BigInteger id, @RequestParam String title,@RequestParam long gross, @RequestParam String genre) {
		// menuItemDao.editMenuItem(name, price, id);
		// List<MenuItem> list = menuItemDao.getMenuListJDBCTemplate();
		Movie menuItem = new Movie();
		menuItem.setMovie_id(id);
		menuItem.setTitle(title);
		menuItem.setBox_office(gross);
		menuItem.setGenre(genre);
		movieDaoImpl.modifyMovie(title,gross,genre,id);
		return "edit-movie-status";
	}
	
	@CrossOrigin
	@RequestMapping(value="/home")
	@ResponseBody
	public List<Movie> getMovies(ModelMap model)
	{
		List<Movie> list=movieDaoImpl.getMovieListAdmin();
		System.out.println(list);
		model.put("list", list);
		return list;
	}
	*/
		
	@RequestMapping("/admin")
	public String testGetAllAdminMovies(ModelMap model) {
	List<Movie> list=movieService.getAllMovies();
	LOGGER.debug("Movies={}", list);
	model.put("list", list);
	return "movie-list-admin";
	}
	
	@RequestMapping("/customer")
	public String viewMoviesCustomer(ModelMap model) {

		String name = (String) model.getAttribute("username");
		model.put("name", name);

		List<Movie> customerMovieList = new ArrayList<>();
		customerMovieList = movieService.findAllMoviesCustomer();
		model.put("list", customerMovieList);
		return "movie-list-customer";

	}
	
	@RequestMapping("/view-favorites")
	public String viewFavorites(ModelMap model){
		
		User user = userService.getUserByName("user");
		Set<Favorites> favorites = favoritesService.getFavorites(user.getId());
		List<Movie> movies = new ArrayList<>();
		for(Favorites fav : favorites) {
			
			Movie mo = movieService.findById(fav.getFavMovId());
			movies.add(mo);
			
		}
		model.put("list", movies);
		return "viewFav"; 
		
	}
	
	@RequestMapping(value = "/addToFav", method = RequestMethod.GET)
	public String AddToFavouriteMovies(ModelMap model, @RequestParam int id) {
		
		User user = userService.getUserByName("user");
		
		Favorites favorite = new Favorites();
		favorite.setFavUsId(user.getId());
		favorite.setFavMovId(id);
		favoritesService.addToFavorites(favorite);
		
		Movie movie = movieService.findById(id);
		
		String message = movie.getTitle() + " added to favorites successfully";
		model.put("message", message);
		
		List<Movie> customerMovieList = new ArrayList<>();
		customerMovieList = movieService.findAllMoviesCustomer();
		model.put("list", customerMovieList);
		return "add-fav";
	}
	
	@RequestMapping("/view-fav")
	public String viewFavAfterDelete(ModelMap model, @RequestParam int id) throws EmptyFavoritesException {
		
		User user = userService.getUserByName("user");
		
		favoritesService.deleteFavorites(id);
		Set<Favorites> favorites = favoritesService.getFavorites(user.getId());
		List<Movie> movies = new ArrayList<>();
		for(Favorites fav : favorites) {
			
			Movie mo = movieService.findById(fav.getFavMovId());
			movies.add(mo);
			
		}
		model.put("list", movies);
		return "viewFav";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String showEdit(ModelMap model, @RequestParam int id) {
		Movie movie = movieService.findById(id);
		model.put("movie", movie);
		return "edit-movie";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String viewEdit(ModelMap model, @RequestParam String title,
			@RequestParam String genre, @RequestParam BigInteger boxOffice) {
		Movie movie = movieService.findByName(title);
		movie.setBox_office(boxOffice);
		movie.setGenre(genre);
		movieService.saveMovie(movie);
		return "edit-movie-status";
	}

}
