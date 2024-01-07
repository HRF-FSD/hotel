<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inscription</title>
    <link rel="stylesheet" href="registerCSS.css"/>
</head>
<body>

<div class="form-container">
    <h2>Inscription</h2>
    <form action="RegisterServlet" method="post">
        <div class="input-group">
            <label for="name">Nom :</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="input-group">
            <label for="email">Email :</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="input-group">
            <label for="password">Mot de passe :</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit" class="btn">S'inscrire</button>
    </form>
    <p>Déjà inscrit ? <a href="login.jsp">Connectez-vous</a></p>
</div>

</body>
</html>
