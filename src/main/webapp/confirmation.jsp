<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Confirmation de Réservation</title>
  <link rel="stylesheet" href="confirmationCSS.css"/>
</head>
<body>

<div class="confirmation-container">
  <h2>Confirmation de Votre Réservation</h2>
  <p>Votre réservation a été effectuée avec succès!</p>
  <p><strong>Nom :</strong> <%= request.getAttribute("fullName") %></p>
  <p><strong>Email :</strong> <%= request.getAttribute("email") %></p>
  <p><strong>Date d'Arrivée :</strong> <%= request.getAttribute("checkIn") %></p>
  <p><strong>Date de Départ :</strong> <%= request.getAttribute("checkOut") %></p>
  <p><strong>Type de Chambre :</strong> <%= request.getAttribute("roomType") %></p>

  <a href="index.jsp" class="btn">Retour à l'Accueil</a>
</div>

</body>
</html>
