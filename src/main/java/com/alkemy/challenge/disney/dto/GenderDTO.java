
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
public class GenderDTO {

    private String image;
    
    private String name;
    
    private List<FilmDTO> filmDTOS= new ArrayList<>();
}
