<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Connexion</title>
    <link rel="stylesheet" href="loginCSS.css"/>
</head>
<body>

<div class="login-container">
    <h2>Connexion</h2>
    <form action="LoginServlet" method="post">
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="password">Mot de passe:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit" class="btn">Se connecter</button>
    </form>
    <p>Vous n'avez pas de compte ? <a href="register.jsp">Inscrivez-vous</a></p>
</div>

</body>
</html>
