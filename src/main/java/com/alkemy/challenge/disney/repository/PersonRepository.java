
package com.alkemy.challenge.disney.repository;

import com.alkemy.challenge.disney.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

}
