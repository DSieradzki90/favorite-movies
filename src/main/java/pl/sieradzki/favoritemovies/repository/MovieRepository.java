package pl.sieradzki.favoritemovies.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sieradzki.favoritemovies.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository <Movie,Long> {
}
