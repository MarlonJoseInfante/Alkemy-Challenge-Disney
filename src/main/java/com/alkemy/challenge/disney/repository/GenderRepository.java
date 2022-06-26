
package com.alkemy.challenge.disney.repository;

import com.alkemy.challenge.disney.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender, String>{

}
