package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_actor_mapping",
            joinColumns = {@JoinColumn(name = "movie_id")},
    inverseJoinColumns = {@JoinColumn(name = "actor_id")})
    private Set<Actor> actors = new HashSet<>();

    public Movie(String name) {
        this.name = name;
    }

    public Set<Actor> getActor() {
        return actors;
    }
}
