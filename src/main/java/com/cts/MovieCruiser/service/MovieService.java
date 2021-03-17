package com.cts.MovieCruiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.MovieCruiser.Movie;
import com.cts.MovieCruiser.repository.MovieRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MovieService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);

	@Autowired
	MovieRepository movieRepository;

	@Transactional
	public List<Movie> getAllMovies() {

		return movieRepository.getAllMovies();
	}

	public Movie findById(int favMovId) {
		return movieRepository.findById(favMovId).get();
	}

	public List<Movie> findAllMoviesCustomer() {
		return movieRepository.findByActive("Yes");

	}

	public void saveMovie(Movie movie) {

		movieRepository.save(movie);

	}

	public Movie findByName(String title) {

		return movieRepository.findByTitle(title);

	}
}
