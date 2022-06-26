
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
public class PersonDTO {

    private String image;
    
    private String name;
    
    private Integer age;
    
    private Double weight;
    
    private String history;
    
    private List<FilmDTO>filmDTOs= new ArrayList<>();
}
