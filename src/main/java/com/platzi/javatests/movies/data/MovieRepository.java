package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Movie findById(Integer id);
    Collection<Movie> finAll();
    void saveOrUpdate(Movie movie);
}
