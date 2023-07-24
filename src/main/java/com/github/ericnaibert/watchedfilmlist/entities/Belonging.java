package com.github.ericnaibert.watchedfilmlist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@EmbeddedId
	private BelongingPrimaryKey id;
	
	private Integer position;
	
	public Belonging() {
	}

	public Belonging(Film film, FilmList list, Integer position) {
		id.setFilm(film);
		id.setList(list);
		this.position = position;
	}

	public BelongingPrimaryKey getId() {
		return id;
	}

	public void setId(BelongingPrimaryKey id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	

}
