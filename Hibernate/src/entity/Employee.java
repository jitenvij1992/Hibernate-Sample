
package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Comparable<Employee> {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade={CascadeType.PERSIST, })
    @JoinColumn(name="passport_id", unique=true)
    private Passport passport;

    public Employee() {}
    public Employee(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;

    }
}











