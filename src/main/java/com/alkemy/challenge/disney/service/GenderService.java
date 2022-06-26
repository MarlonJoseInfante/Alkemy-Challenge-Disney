
package com.alkemy.challenge.disney.service;

import com.alkemy.challenge.disney.dto.GenderDTO;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface GenderService {

    GenderDTO save(GenderDTO genderDTO);
    
    GenderDTO update(String id, GenderDTO genderDTO);
    
    void delete(String id);
    
    List<GenderDTO> listAll();
}
