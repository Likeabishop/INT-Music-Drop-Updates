<%-- 
    Document   : reset_passsword
    Created on : May 1, 2025, 9:02:44 AM
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
        <p>Enter your registered email address, and we'll help you reset your password.</p>

        <form class="form-container" action="#" method="post">
            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" required>
            </div>

            <button type="submit" class="btn">Reset Password</button>
        </form>
    </body>
</html>
