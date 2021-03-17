package com.cts.MovieCruiser;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MovieDaoImpl implements MovieDao {

	@Autowired
	JdbcTemplate jdb;

	@Override
	public List<Movie> getMovieListAdmin() {
		String sql = "select * from movie";
		List<Movie> list = jdb.query(

				sql, new MovieMapper());
		for (Movie l : list) {
			System.out.println(l);
		}
		return list;
	}

	@Override
	public List<Movie> getMovieListCustomer() {
		List<Movie> movieListCust = new ArrayList<Movie>();
		Date today = new Date();
		String sql = "select * from movie";
		List<Movie> list = jdb.query(sql, new MovieMapper());
		for (Movie movie : list) {
			if (movie.getDateOfLaunch().getTime() <= today.getTime() && movie.getActive().equals("yes")) {
				movieListCust.add(movie);
			}
		}
		return movieListCust;
	}

	@Override
	public void modifyMovie(String title, long gross, String genre, BigInteger id) {
		String sql = "update movie" + " set title=? ," + " box_office=?" + ", genre=?" + " where movie_id=?";
		jdb.update(sql, title, gross, genre, id);
	}

}
