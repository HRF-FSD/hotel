<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.test.hoteltest.Reservation" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
  <title>Reservation Confirmation</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      margin: 0;
      padding: 0;
      background-image: url('pictures/confirmation.png');
      background-size: cover;
      background-position: center;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .confirmation-container {
      background-color: rgba(255, 255, 255, 0.95);
      padding: 40px;
      border-radius: 10px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
      width: 100%;
      max-width: 500px;
      text-align: center;
    }

    .header h2 {
      color: #5cb85c;
      margin: 0 0 10px;
    }

    .header p {
      color: #333333;
      font-size: 1.1em;
      margin-top: 0;
    }

    .details ul {
      list-style-type: none;
      padding: 0;
      text-align: left;
    }

    .details li {
      margin-bottom: 10px;
      font-size: 1em;
      color: #555555;
    }

    .details li strong {
      color: #333333;
    }

    .print-button {
      background-color: #5cb85c;
      color: white;
      border: none;
      padding: 10px 20px;
      border-radius: 5px;
      cursor: pointer;
      font-size: 1em;
      margin-top: 20px;
    }

    .print-button:hover {
      background-color: #4cae4c;
    }
  </style>
</head>
<body>
<div class="confirmation-container">
  <div class="header">
    <h2>Reservation Confirmed</h2>
    <p>Your reservation details are below:</p>
  </div>
  <%
    Reservation reservation = (Reservation) request.getAttribute("reservation");
    if (reservation != null) {
  %>
  <div class="details">
    <ul>
      <li><strong>Email:</strong> <%= reservation.getUserEmail() %></li>
      <li><strong>Room ID:</strong> <%= reservation.getRoomId() %></li>
      <li><strong>Check-in:</strong> <%= new SimpleDateFormat("yyyy-MM-dd").format(reservation.getCheckInDate()) %></li>
      <li><strong>Check-out:</strong> <%= new SimpleDateFormat("yyyy-MM-dd").format(reservation.getCheckOutDate()) %></li>
    </ul>
  </div>
  <button class="print-button" onclick="window.print()">Print Confirmation</button>
  <% } else { %>
  <p>There was an error processing your reservation.</p>
  <% } %>
</div>
</body>
</html>
