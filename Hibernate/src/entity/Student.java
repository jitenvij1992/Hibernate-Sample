package entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "guide_id")
    private Guide guide;

    public Student() {
    }

    public Student(String name, Guide guide) {

        this.name = name;
        this.guide = guide;
    }


}
