
package com.alkemy.challenge.disney.service;

import com.alkemy.challenge.disney.dto.PersonDTO;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface PersonService {

    PersonDTO save(PersonDTO personDTO);
    
    PersonDTO update(String id, PersonDTO personDTO);
    
    void delete(String id);
    
    List<PersonDTO> listAll();
}
