
package com.alkemy.challenge.disney.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDTO {
    
    private String id;
    private String tittle;
    private String createdDate;
    private int qualification;
    private GenderDTO genderDTO;
    private List<PersonDTO> personDTOs= new ArrayList<>();
}
