package com.test.hoteltest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/RoomsServlet")
public class RoomsServlet extends HttpServlet {

    private EntityManagerFactory emf;

    @Override
    public void init() {
        // Initialize EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("PERSISTENCE");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Room> query = em.createQuery("SELECT r FROM Room r", Room.class);
            List<Room> availableRooms = query.getResultList();
            System.out.println("Rooms fetched: " + availableRooms.size()); // Add this line for logging
            request.setAttribute("availableRooms", availableRooms);
            request.getRequestDispatcher("/rooms.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred processing the request.");
        } finally {
            em.close();
        }
    }


    @Override
    public void destroy() {
        emf.close();
    }
}
