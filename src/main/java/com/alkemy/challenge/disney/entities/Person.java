
package com.alkemy.challenge.disney.entities;

import com.alkemy.challenge.disney.entities.base.BaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE person SET deleted = tru WHERE id = ?")
@Where(clause = "delete = false")
@Data
@NoArgsConstructor @AllArgsConstructor
public class Person extends BaseEntity{
    
    private String image;
    
    private String name;
    
    private Integer age;
    
    private Double weight;
    
    private String history;
    
}
