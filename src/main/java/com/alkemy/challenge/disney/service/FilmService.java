
package com.alkemy.challenge.disney.service;

import com.alkemy.challenge.disney.dto.FilmDTO;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface FilmService {

    
    FilmDTO save(FilmDTO filmDTO);
    
    FilmDTO update(String id, FilmDTO filmDTO);
    
    void delete(String id);
    
    List<FilmDTO> listAll();
}
