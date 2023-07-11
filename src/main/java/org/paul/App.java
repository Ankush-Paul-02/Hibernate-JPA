package org.paul;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

// JPA implementation
public class App {
    public static void main(String[] args) {

        Dev dev = new Dev();
        dev.setId(5);
        dev.setName("Shouvik");
        dev.setTech("Flutter");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /*
        Dev dev = entityManager.find(Dev.class, 1);
        */

        entityManager.getTransaction().begin();
        entityManager.persist(dev);
        entityManager.getTransaction().commit();


        System.out.println(dev);



    }
}
