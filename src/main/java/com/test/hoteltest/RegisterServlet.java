package com.test.hoteltest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        boolean isUserCreated = createUser(name, email, password);

        if (isUserCreated) {

            response.sendRedirect("login.jsp");
        } else {
            // Sinon, renvoyez à la page d'inscription avec un message d'erreur
            request.setAttribute("errorMessage", "Inscription échouée, veuillez réessayer");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }

    private boolean createUser(String name, String email, String password) {


        return false;
    }
}
