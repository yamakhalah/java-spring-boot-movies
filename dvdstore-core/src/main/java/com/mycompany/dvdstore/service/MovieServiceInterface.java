package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    Movie getMovieById(long id);
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();
}
