package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "friend_mapping", joinColumns = @JoinColumn(name = "NickId"))
    @Column(name = "nickname")
    Collection<String> nickname = new ArrayList<>();
}
