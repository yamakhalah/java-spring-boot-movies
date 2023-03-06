package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    public static long lastId=0L;
    private List<Movie> movies=new ArrayList<>();

    @Override
    public <S extends Movie> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Movie> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Movie> findAll() {
        return null;
    }

    @Override
    public Iterable<Movie> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Movie entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Movie> entities) {

    }

    @Override
    public void deleteAll() {

    }

    /*

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }

    public Movie add(Movie movie){
        movie.setId(++lastId);
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
        return movie;
    }

    @Override
    public List<Movie> list() {
        return movies;
    }
    */
}
