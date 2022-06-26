
package com.alkemy.challenge.disney.repository;

import com.alkemy.challenge.disney.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, String>{

}
