package com.cts.MovieCruiser;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class MovieMapper implements RowMapper<Movie> {

	@Override

	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {

		Movie movie = new Movie();

		movie.setTitle(rs.getString(2));

		movie.setMovie_id(rs.getInt(1));
		//movie.setBox_office(rs.getLong(3));
		movie.setActive(rs.getString(4));
		
		movie.setGenre(rs.getString(5));
		movie.setHasTeaser(rs.getString(6));
		movie.setDateOfLaunch(rs.getDate(7));
		return movie;

	}

}
