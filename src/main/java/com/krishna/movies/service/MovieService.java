package com.krishna.movies.service;

import com.krishna.movies.repository.MovieRepository;
import com.krishna.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
