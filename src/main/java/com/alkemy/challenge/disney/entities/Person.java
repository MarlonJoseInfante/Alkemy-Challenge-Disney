
package com.alkemy.challenge.disney.entities;

import com.alkemy.challenge.disney.entities.base.BaseEntity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE person SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class Person extends BaseEntity{
    
    private String image;
    
    private String name;
    
    private Integer age;
    
    private Double weight;
    
    private String history;
    
    @ManyToMany(mappedBy = "persons", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Film> films= new HashSet<>();

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    public void addFilm(Film film){
        films.add(film);
    }
    
    public void removeFilm(Film film){
        films.remove(film);
    }
}
