package com.test.hoteltest;



import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
        EntityManager em = emf.createEntityManager();

        // Your database operations go here


        em.close();
        emf.close();
    }
}
