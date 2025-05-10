<%-- 
    Document   : login
    Created on : Apr 30, 2025, 11:43:43 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="login.css" type="text/css">
    </head>
    <body>
        <h1>Welcome Back</h1>

        <p>
            Log in to your Music Dropped account and stay updated with the latest releases from your favorite artists.
        </p>

        <form class="form-container" action="LoginServlet.do" method="POST">
            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
      
            <button type="submit" class="btn">Login</button>

            <div class="link-container">
                <p>Forgot Password? <a class="form-link" href="reset_passsword.jsp">Reset here</a></p>
                <p>Don't have an account? <a class="form-link" href="../Sign-up/sign_up.jsp">Sign up here</a></p>
            </div>
        </form>
    </body>
</html>
