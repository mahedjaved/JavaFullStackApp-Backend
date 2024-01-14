package dev.mahed.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService
{

    // reference to the repository
    @Autowired
    private MovieRepository movieRepository;
    // database access methods
    public List<Movie> allMovies()
    {
        return movieRepository.findAll();
    }
}
