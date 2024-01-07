package com.test.hoteltest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
// Importez d'autres packages nécessaires, par exemple, pour la gestion de base de données

@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        LocalDate checkIn = LocalDate.parse(request.getParameter("checkIn"));
        LocalDate checkOut = LocalDate.parse(request.getParameter("checkOut"));
        String roomType = request.getParameter("roomType");


        boolean isReservationSuccessful = makeReservation(fullName, email, checkIn, checkOut, roomType);

        if (isReservationSuccessful) {

            request.setAttribute("successMessage", "Votre réservation a été enregistrée avec succès.");
            request.getRequestDispatcher("/reservation-success.jsp").forward(request, response);
        } else {

            request.setAttribute("errorMessage", "Erreur lors de la réservation. Veuillez réessayer.");
            request.getRequestDispatcher("/reservation.jsp").forward(request, response);
        }
    }

    private boolean makeReservation(String fullName, String email, LocalDate checkIn, LocalDate checkOut, String roomType) {


        return false; //
    }
}



