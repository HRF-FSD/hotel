package com.test.hoteltest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/RoomsServlet")
public class RoomsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        List<Room> availableRooms = getAvailableRooms();


        request.setAttribute("availableRooms", availableRooms);


        request.getRequestDispatcher("/rooms.jsp").forward(request, response);
    }

    private List<Room> getAvailableRooms() {

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1,"Chambre Standard", 12.0, true));
        rooms.add(new Room(3,"Chambre double", 42.0, false));

        return rooms;
    }
}

