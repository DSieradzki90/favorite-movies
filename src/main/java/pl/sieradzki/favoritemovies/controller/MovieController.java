package pl.sieradzki.favoritemovies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sieradzki.favoritemovies.service.MovieService;
import pl.sieradzki.favoritemovies.model.Movie;

import java.util.Optional;

@RestController
@RequestMapping("api/movies")
public class MovieController {


    private MovieService movies;

    @Autowired
    public MovieController(MovieService movies) {
        this.movies = movies;
    }

    @GetMapping("/all")
    public Iterable<Movie> getAll() {
        return movies.findAll();
    }

    @GetMapping
    public Optional<Movie> getById(@RequestParam Long id) {
        return movies.findById(id);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movies.save(movie);

    }

    @PutMapping
    public Movie updateMovie(@RequestBody Movie movie) {
        return movies.save(movie);
    }

    @DeleteMapping
    public void deleteMovie(@RequestParam Long id) {
        movies.deleteById(id);
    }
}

