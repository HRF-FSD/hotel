package com.test.hoteltest;



import com.test.hoteltest.User;
import com.test.hoteltest.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UserDAO {

    public void saveUser(User user) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(user);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    // Autres méthodes CRUD...
}
