package com.cts.MovieCruiser.service;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cts.MovieCruiser.Favorites;
import com.cts.MovieCruiser.repository.FavoritesRepository;

@Service
public class FavoritesService {

	@Autowired
	FavoritesRepository favoritesRepository;

	public Set<Favorites> getFavorites(int id) {

		return favoritesRepository.findByFavUsId(id);

	}

	public void addToFavorites(Favorites favorite) {

		favoritesRepository.save(favorite);

	}

	@Transactional
	public void deleteFavorites(int mov_id) {

		favoritesRepository.deleteByFavMovId(mov_id);

	}
}
