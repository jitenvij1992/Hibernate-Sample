package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.PERSIST)
    private Set<Student> students = new HashSet<>();

    public Set<Student> getStudents() {
        return students;
    }

    public Guide() {
    }

    public Guide(String name) {

        this.name = name;
    }
}
