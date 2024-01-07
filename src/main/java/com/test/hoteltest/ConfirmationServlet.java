package com.test.hoteltest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ConfirmationServlet")
public class ConfirmationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String checkIn = request.getParameter("checkIn");
        String checkOut = request.getParameter("checkOut");
        String roomType = request.getParameter("roomType");


        boolean reservationSuccess = processReservation(fullName, email, checkIn, checkOut, roomType);

        if (reservationSuccess) {

            request.setAttribute("fullName", fullName);
            request.setAttribute("email", email);
            request.setAttribute("checkIn", checkIn);
            request.setAttribute("checkOut", checkOut);
            request.setAttribute("roomType", roomType);


            request.getRequestDispatcher("/confirmation.jsp").forward(request, response);
        } else {

            request.setAttribute("errorMessage", "Erreur lors de la réservation. Veuillez réessayer.");
            request.getRequestDispatcher("/reservation.jsp").forward(request, response);
        }
    }

    private boolean processReservation(String fullName, String email, String checkIn, String checkOut, String roomType) {


        return true;
    }
}
