<%-- Document : sign_up_admin Created on : Apr 30, 2025, 11:38:48 PM Author : user --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
            <link rel="stylesheet" href="../style.css" type="text/css">
        </head>

        <body>
            <h1>Admin Registration</h1>

            <p>
                Register as an admin to manage and update the latest music releases. Access is restricted to authorized
                personnel only.
            </p>


            <form class="form-container" action="../RegArtistServlet.do" method="post">

                <form class="form-container" action="" method="post">
                    <div class="form-group">
                        <label for="artistName">Artist ID number:</label>
                        <input type="text" id="artistName" name="id" required>
                    </div>

                    <div class="form-group">
                        <label for="artistName">Artist Name</label>
                        <input type="text" id="adminName" name="name" required>
                    </div>

                    <div class="form-group">
                        <label for="artistSurname">Artist Surname</label>
                        <input type="text" id="artistSurname" name="artistSurname" required>
                    </div>

                    <div class="form-group">
                        <label for="artistStageName">Artist Stage Name</label>
                        <input type="text" id="artistStageName" name="artistStageName" required>
                    </div>

                    <div class="form-group">
                        <select name="genre">
                            <option value="Amapiano">Amapiano</option>
                            <option value="HipHop">HipHop</option>
                            <option value="Lekompo">Lekompo</option>
                            <option value="Maskandi">Maskandi</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="adminEmail">Email Address</label>
                        <input type="email" id="adminEmail" name="email" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="adminPassword">Email Address</label>
                        <input type="email" id="adminPassword" name="adminPassword" required>
                    </div>

                    

                    <button type="submit" class="btn">Sign Up as Artist</button>

                    <div class="link-container">
                        <p>Forgot Password? <a class="form-link" href="../Reset/reset_passsword.jsp">Reset here</a></p>
                        <p>Already have an account? <a class="form-link" href="../LoginPage/login.jsp">Login here</a>
                        </p>
                        <p>Not an admin? <a class="form-link" href="../Sign-up/sign_up.jsp">Sign up as a regular
                                user</a></p>
                    </div>
                </form>
        </body>

        </html>