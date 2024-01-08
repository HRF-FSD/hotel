package com.test.hoteltest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.test.hoteltest.Reservation;
import com.test.hoteltest.HibernateUtil;

public class ReservationDAO {

    public void saveReservation(Reservation reservation) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.persist(reservation);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
