<%@ page import="com.test.hoteltest.Room" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Our HsH Rooms</title>
    <link rel="stylesheet" href="roomsCSS.css">
</head>
<body>
<header class="hotel-header">
    <div class="quote-banner">
        <p class="hotel-quote">"The great advantage of a hotel is that it is a refuge from home life."</p>
    </div>
    <img src="pictures/banner.png" alt="Hotel Image" class="hotel-image"/>
</header>


<section class="room-section">
    <h1>Our Rooms</h1>

    <%-- Dynamic Room Display --%>
    <%
        List<Room> rooms = (List<Room>) request.getAttribute("availableRooms");
        if(rooms != null){
            for(Room room : rooms){
                String imagePath;
                switch (room.getType().toLowerCase()) {
                    case "single":
                        imagePath = "pictures/single.png";
                        break;
                    case "double":
                        imagePath = "pictures/superior-room.jpg";
                        break;
                    case "suite":
                        imagePath = "pictures/suite.png";
                        break;
                    case "triple":
                        imagePath = "pictures/triple.png";
                        break;
                    default:
                        imagePath = "pictures/default.png"; // Default image if type doesn't match
                        break;
                }
    %>
    <div class="room">
        <img src="<%= imagePath %>" alt="Room Image"/>
        <h2><%= room.getType() %></h2>
        <p><%= room.getIsAvailable() ? "Available" : "Not Available" %></p>
        <p>Price: <%= room.getPrice() %> DH</p>
        <a href="reservation.jsp?roomId=<%= room.getId() %>">Order Now</a>

    </div>
    <%
            }
        }
    %>

</section>

<footer class="hotel-footer">
    <p>"Experience the ultimate luxury and comfort with us."</p>
</footer>

<script src="roomJS.js"></script>
</body>
</html>
