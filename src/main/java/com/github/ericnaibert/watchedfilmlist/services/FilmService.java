package com.github.ericnaibert.watchedfilmlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.ericnaibert.watchedfilmlist.dto.FilmDTO;
import com.github.ericnaibert.watchedfilmlist.dto.FilmMinDTO;
import com.github.ericnaibert.watchedfilmlist.entities.Film;
import com.github.ericnaibert.watchedfilmlist.repositories.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	@Transactional(readOnly = true)
	public FilmDTO findById(Long filmId) {
		Film result = filmRepository.findById(filmId).get();
		return new FilmDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<FilmMinDTO> findAll() {
		List<Film> result = filmRepository.findAll();
		return result.stream().map(x -> new FilmMinDTO(x)).toList();
	}
	
}
