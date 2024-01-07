<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Effectuer une Réservation</title>
  <link rel="stylesheet" href="reservationCSS.css"/>
</head>
<body>

<div class="reservation-container">
  <h2>Réserver une Chambre</h2>
  <form action="ReservationServlet" method="post">
    <div class="form-group">
      <label for="fullName">Nom Complet :</label>
      <input type="text" id="fullName" name="fullName" required>
    </div>
    <div class="form-group">
      <label for="email">Email :</label>
      <input type="email" id="email" name="email" required>
    </div>
    <div class="form-group">
      <label for="checkIn">Date d'Arrivée :</label>
      <input type="date" id="checkIn" name="checkIn" required>
    </div>
    <div class="form-group">
      <label for="checkOut">Date de Départ :</label>
      <input type="date" id="checkOut" name="checkOut" required>
    </div>
    <div class="form-group">
      <label for="roomType">Type de Chambre :</label>
      <select id="roomType" name="roomType">
        <option value="standard">Standard</option>
        <option value="deluxe">Deluxe</option>
        <option value="suite">Suite</option>
      </select>
    </div>
    <button type="submit" class="btn">Réserver</button>
  </form>
</div>

</body>
</html>
