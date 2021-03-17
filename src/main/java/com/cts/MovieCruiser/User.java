package com.cts.MovieCruiser;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="user")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="user_id")
	int id;
	
	@Column(name="user_name")
	String name;
	
	@ManyToMany
    @JoinTable(name = "favorites",
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private Set<Movie> favList;

	

	public Set<Movie> getFavList() {
		return favList;
	}

	public void setFavList(Set<Movie> favList) {
		this.favList = favList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	
}
