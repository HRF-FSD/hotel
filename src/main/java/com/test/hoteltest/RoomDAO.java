package com.test.hoteltest;

import com.test.hoteltest.Room;
import com.test.hoteltest.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomDAO {

    public void saveRoom(Room room) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.persist(room);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

  //methode CRUD
}
