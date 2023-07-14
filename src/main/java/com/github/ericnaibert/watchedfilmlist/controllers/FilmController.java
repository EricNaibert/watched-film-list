package com.github.ericnaibert.watchedfilmlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ericnaibert.watchedfilmlist.dto.FilmMinDTO;
import com.github.ericnaibert.watchedfilmlist.services.FilmService;

@RestController
@RequestMapping(value = "/films")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping
	public List<FilmMinDTO> findAll() {
		List<FilmMinDTO> result = filmService.findAll();
		return result;
		
	}

}
