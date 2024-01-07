package com.test.hoteltest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");


        boolean isValidUser = checkUser(email, password);

        if (isValidUser) {

            request.getSession().setAttribute("user", email);
            response.sendRedirect("welcome.jsp");
        } else {

            request.setAttribute("errorMessage", "Identifiants invalides");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    private boolean checkUser(String email, String password) {


        return false;
    }
}
