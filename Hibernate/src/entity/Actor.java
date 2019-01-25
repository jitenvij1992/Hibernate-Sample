package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies = new HashSet<>();

    public Actor(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }
}
