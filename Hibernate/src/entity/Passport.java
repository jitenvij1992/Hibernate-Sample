package entity;

import javax.persistence.*;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "passport_number")
    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    private Employee customer;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Employee getCustomer() {
        return customer;
    }
}
