<%-- 
    Document   : update_password
    Created on : May 1, 2025, 9:08:05 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Page</title>
        <link rel="stylesheet" href="../style.css" type="text/css">
    </head>
    <body>
        <h1>Reset Your Password</h1>

        <p>
            Forgot your password? No worries. Just enter your registered email address and a new password below.
        </p>

        <form class="form-container" action="#" method="post">
            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="newPassword">New Password</label>
                <input type="password" id="newPassword" name="newPassword" required>
            </div>

            <div class="form-group">
                <label for="confirmPassword">Confirm New Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
            </div>

            <button type="submit" class="btn">Update Password</button>

            <div class="link-container">
                <p>Remembered your password? <a class="form-link" href="login.jsp">Back to Login</a></p>
            </div>
        </form>
    </body>
</html>
