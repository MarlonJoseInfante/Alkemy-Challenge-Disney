

package com.alkemy.challenge.disney.entities;

import com.alkemy.challenge.disney.entities.base.BaseEntity;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE film SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Setter @Getter
@NoArgsConstructor 
@AllArgsConstructor
public class Film extends BaseEntity{
    
    private String image;
    
    private String tittle;
    
    private LocalDate createdDate;
    
    private int qualification;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "person_film", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_person"))
    private Set<Person> persons= new HashSet<>();
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "gender_film", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_gender") )
    private Gender gender;

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (!Objects.equals(this.tittle, other.tittle)) {
            return false;
        }
        return true;
    }

    
    public void addPerson(Person person){
        persons.add(person);
    }
    
    public void removePerson(Person person){
        persons.remove(person);
    }
}
