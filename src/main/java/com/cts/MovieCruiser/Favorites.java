package com.cts.MovieCruiser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "favorites")
public class Favorites {
	
	@Id
	@Column(name = "fav_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int favUsId;
	
	@Column(name = "movie_id")
	private int favMovId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFavUsId() {
		return favUsId;
	}
	public void setFavUsId(int favUsId) {
		this.favUsId = favUsId;
	}
	public int getFavMovId() {
		return favMovId;
	}
	public void setFavMovId(int favMovId) {
		this.favMovId = favMovId;
	}
	@Override
	public String toString() {
		return "Favorites [id=" + id + ", favUsId=" + favUsId + ", favMovId=" + favMovId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + favMovId;
		result = prime * result + favUsId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favorites other = (Favorites) obj;
		if (favMovId != other.favMovId)
			return false;
		if (favUsId != other.favUsId)
			return false;
		return true;
	}
	

}



