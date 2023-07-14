package com.github.ericnaibert.watchedfilmlist.dto;

import com.github.ericnaibert.watchedfilmlist.entities.Film;

public class FilmMinDTO {
	
	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public FilmMinDTO() {
	}

	public FilmMinDTO(Film entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
		

}
