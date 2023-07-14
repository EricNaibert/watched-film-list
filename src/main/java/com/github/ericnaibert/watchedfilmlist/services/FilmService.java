package com.github.ericnaibert.watchedfilmlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.ericnaibert.watchedfilmlist.dto.FilmMinDTO;
import com.github.ericnaibert.watchedfilmlist.entities.Film;
import com.github.ericnaibert.watchedfilmlist.repositories.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	public List<FilmMinDTO> findAll() {
		List<Film> result = filmRepository.findAll();
		return result.stream().map(x -> new FilmMinDTO(x)).toList();
	}
	
}
