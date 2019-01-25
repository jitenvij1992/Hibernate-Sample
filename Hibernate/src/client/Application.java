package client;

import entity.*;
import org.hibernate.Session;

import util.HibernateUtil;


public class Application {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
//
//        Guide guide = new Guide("Test Guide 2");
//        Student student = new Student("test Student2", guide);
//
//        session.persist(student);
        //session.save(student);

//        Student student = (Student) session.get(Student.class, 2L);
//        session.delete(student);

//        Guide guide1 = new Guide("Test guide 3");
//        Guide guide2 = new Guide("Test guide 4");
//        guide1.getStudents().add(new Student("test student 3", guide1));
//        guide2.getStudents().add(new Student("test student 4", guide1));


//        Passport passport = new Passport("925076473");
//        Employee customer = new Employee("Nicole Scott", passport);

        Actor actor = new Actor("Hero");
        Movie movie = new Movie("test");
        actor.getMovies().add(movie);
        movie.getActor().add(actor);

        session.persist(movie);

//        session.persist(guide1);
//        session.persist(guide2);


        session.getTransaction().commit();
        session.close();

    }
}

