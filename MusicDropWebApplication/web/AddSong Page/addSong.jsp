<%-- 
    Document   : addSong.jsp
    Created on : May 10, 2025, 2:30:45 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Song</title>
        <link rel="stylesheet" href="addSong.css" type="text/css">
    </head>
    <body>
        <h1>Add a New Song</h1>

        <p>
            Fill out the form below to upload a new song to the platform. Ensure that all fields are accurate before submission.
        </p>

        <form class="form-container" action="#" method="post">
            
            <div class="form-group">
                <label for="songTitle">Song Title</label>
                <input type="text" id="songTitle" name="songTitle" required>
            </div>
            
            <div class="form-group">
                <label for="duration">Duration (e.g., 3:45)</label>
                <input type="text" id="duration" name="duration" required>
            </div>
            
            <div class="form-group">
                <label for="genre">Genre</label>
                <select id="genre" name="genre" required>
                    <option value="">-- Select Genre --</option>
                    <option value="Amapiano">Amapiano</option>
                    <option value="HipHop">HipHop</option>
                    <option value="Lekompo">Lekompo</option>
                    <option value="Maskandi">Maskandi</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="releaseDate">Release Date</label>
                <input type="date" id="releaseDate" name="releaseDate" required>
            </div>

            <button type="submit" class="btn">Add Song</button>

            <div class="link-container">
                <p><a class="form-link" href="../DashBoard/dashboard.jsp">Back to Dashboard</a></p>
            </div>
        </form>
    </body>
</html>
