package com.cts.MovieCruiser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class FavoritesDaoImpl implements FavoritesDao
{
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	FavoritesMapper mapper;

	
	@Override
	public void addFavorites(long userId, long movieId) 
	{
		String sql = "insert into favorites(user_id, movie_id) values(?,?)";
		jdbc.update(sql,userId, movieId);
		
	}
	

	@Override
	public List<Integer> getFavorites(long userId) throws EmptyFavoritesException
	{
		String sql = "select movie_id from favorites where user_id = ?";
		List<Integer> list = jdbc.query(sql, mapper, userId);
		return list;
	}

	@Override
	public void removeFavorites(long userId, long movieId) 
	{
		String sql = "delete from favorites where user_id=? and movie_id=? ";
		jdbc.update(sql,userId,movieId);

	}
}

	


