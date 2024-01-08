<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <div class="room">
        <img src="pictures/superior-room.jpg" alt="Room Image"/>
        <h2>Superior Room</h2>
        <p>Enjoy the comfort of our Superior Rooms with a breathtaking view.</p>
        <button onclick="orderNow('Superior Room')">Order Now</button>
    </div>
    <div class="room">
        <img src="pictures/superior-room.jpg" alt="Room Image"/>
        <h2>One bedroom suite</h2>
        <p>Enjoy yourself in our one bedroom suite with of course a fabulous view</p>
        <button onclick="orderNow('one bedroom suite')">Order Now</button>
    </div>
    <div class="room">
        <img src="pictures/superior-room.jpg" alt="Room Image"/>
        <h2>One bedroom suite</h2>
        <p>Enjoy yourself in our one bedroom suite with of course a fabulous view</p>
        <button onclick="orderNow('one bedroom suite')">Order Now</button>
    </div>
    <div class="room">
        <img src="pictures/superior-room.jpg" alt="Room Image"/>
        <h2>One bedroom suite</h2>
        <p>Enjoy yourself in our one bedroom suite with of course a fabulous view</p>
        <button onclick="orderNow('one bedroom suite')">Order Now</button>
    </div>

</section>

<footer class="hotel-footer">
    <p>"Experience the ultimate luxury and comfort with us."</p>
</footer>

<script src="roomJS.js"></script>
</body>
</html>
