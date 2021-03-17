package com.cts.MovieCruiser;

import java.math.BigInteger;
import java.util.List;



public interface MovieDao {

	List<Movie> getMovieListAdmin();
	List<Movie>getMovieListCustomer();
	void modifyMovie(String title, long gross, String genre, BigInteger id);
	
}
