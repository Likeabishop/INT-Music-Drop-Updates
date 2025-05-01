<%-- 
    Document   : sign_up
    Created on : Apr 30, 2025, 11:21:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="sign_up.css" type="text/css">
    </head>
    <body>
        <h1>Create Your Account</h1>

        <p>
            Join the Music Dropped community to follow your favorite artists and never miss a new release.
        </p>

        <form class="form-container" action="#" method="post">
            <div class="form-group">
                <label for="name">First Name</label>
                <input type="text" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="surname">Last Name</label>
                <input type="text" id="surname" name="surname" required>
            </div>

            <div class="form-group">
                <label for="age">Age</label>
                <input type="number" id="age" name="age" min="1" required>
            </div>

            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="artist">Favorite Artist (optional)</label>
                <input type="text" id="artist" name="artist">
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>

            <div class="form-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
            </div>

            <button type="submit" class="btn">Sign Up</button>

            <div class="link-container">
                <p>Already have an account? <a class="form-link" href="../LoginPage/login.jsp">Login here</a></p>
            </div>
        </form>
</body>
</html>
