<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil - Réservation d'Hôtel</title>
    <link rel="stylesheet" href="indexCSS.css"/>
</head>
<body>

<header>
    <h1>Bienvenue à HsH Hotel</h1>
    <nav>
        <ul>
            <li><a href="login.jsp">Connexion</a></li>
            <li><a href="register.jsp">Inscription</a></li>
        </ul>
    </nav>
</header>

<section>
    <h2>Découvrez nos Chambres</h2>
    <p>
        Offrez-vous un séjour de luxe dans nos chambres confortables et bien équipées.
    </p>
    <a class="button" href="rooms.jsp">Voir les Chambres</a>
</section>

<section>
    <h2>Réservez votre Chambre</h2>
    <form action="RoomsServlet" method="get">
        <div>
            <label for="checkInDate">Date d'arrivée:</label>
            <input type="date" id="checkInDate" name="checkIn">
        </div>
        <div>
            <label for="checkOutDate">Date de départ:</label>
            <input type="date" id="checkOutDate" name="checkOut">
        </div>
        <div>
            <input type="submit" value="Rechercher">
        </div>
    </form>
</section>

<footer>
    <p>&copy; 2024 Réservation d'Hôtel. Tous droits réservés.</p>
</footer>

</body>
</html>
