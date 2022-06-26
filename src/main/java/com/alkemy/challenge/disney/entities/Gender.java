

package com.alkemy.challenge.disney.entities;

import com.alkemy.challenge.disney.entities.base.BaseEntity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE gender SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gender extends BaseEntity{
    
    private String image;
    
    private String name;
    
    @OneToMany(mappedBy = "gender", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @ToString.Exclude
    private Set<Film> films= new HashSet<>();

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Gender other = (Gender) obj;
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
