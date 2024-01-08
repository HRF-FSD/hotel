<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Make a Reservation</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-image: url('pictures/reservation.png');
      background-size: cover;
      background-position: center;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .reservation-container {
      background-color: rgba(255, 255, 255, 0.9);
      padding: 30px;
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
      max-width: 400px;
      width: 100%;
    }

    .form-group {
      margin-bottom: 15px;
    }

    .form-group label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
    }

    .form-group input[type="email"],
    .form-group input[type="date"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 4px;
    }

    .btn {
      background-color: #4CAF50;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      width: 100%;
    }

    .btn:hover {
      background-color: #45a049;
    }

    h2 {
      text-align: center;
      color: #333;
    }
  </style>
</head>
<body>
<div class="reservation-container">
  <h2>Reserve a Room</h2>
  <form action="ReservationServlet" method="post">
    <input type="hidden" name="roomId" value="<%= request.getParameter("roomId") != null ? request.getParameter("roomId") : "" %>">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>
    </div>
    <div class="form-group">
      <label for="checkIn">Check-in Date:</label>
      <input type="date" id="checkIn" name="checkIn" required>
    </div>
    <div class="form-group">
      <label for="checkOut">Check-out Date:</label>
      <input type="date" id="checkOut" name="checkOut" required>
    </div>
    <button type="submit" class="btn">Reserve</button>
  </form>
</div>
</body>
</html>
