package com.github.ericnaibert.watchedfilmlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ericnaibert.watchedfilmlist.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
	
	

}
