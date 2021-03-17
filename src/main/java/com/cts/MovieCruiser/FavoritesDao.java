package com.cts.MovieCruiser;

import java.util.List;


public interface FavoritesDao {

	void addFavorites(long userId, long movieId);
	public List<Integer> getFavorites(long userId) throws EmptyFavoritesException;
	public void removeFavorites(long userId, long movieId);
}
