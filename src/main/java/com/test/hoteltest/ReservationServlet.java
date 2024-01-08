package com.test.hoteltest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userEmail = request.getParameter("email");
        Long roomId = Long.parseLong(request.getParameter("roomId"));
        String checkInStr = request.getParameter("checkIn");
        String checkOutStr = request.getParameter("checkOut");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Reservation reservation = new Reservation();
            reservation.setUserEmail(userEmail);
            reservation.setRoomId(roomId);
            reservation.setCheckInDate(new SimpleDateFormat("yyyy-MM-dd").parse(checkInStr));
            reservation.setCheckOutDate(new SimpleDateFormat("yyyy-MM-dd").parse(checkOutStr));

            em.persist(reservation);
            em.getTransaction().commit();

            request.setAttribute("reservation", reservation);
            request.getRequestDispatcher("confirmation.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            request.setAttribute("errorMessage", "Erreur lors de la réservation. Veuillez réessayer.");
            request.getRequestDispatcher("reservation.jsp").forward(request, response);
        } finally {
            em.close();
            emf.close();
        }
    }
}
