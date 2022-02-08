package com.francesco.movieadvisor.dao;

import java.util.Collection;

import com.francesco.movieadvisor.model.Film;
/**
 * Interfaz que define las funciones necesarias para gestionar peliculas
 * @author cesco
 *
 */
public interface FilmDao {

	public Film findById(long id);
	public Collection<Film> findAll();
	public void insert(Film film);
	public void edit(Film film);
	public void delete(long id);
}
