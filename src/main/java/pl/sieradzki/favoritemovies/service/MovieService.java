package pl.sieradzki.favoritemovies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sieradzki.favoritemovies.model.Movie;
import pl.sieradzki.favoritemovies.repository.MovieRepository;

import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findById(Long id){
        return movieRepository.findById(id);
    }

    public Iterable<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }

    public void deleteById(Long id){
        movieRepository.deleteById(id);
    }

}
