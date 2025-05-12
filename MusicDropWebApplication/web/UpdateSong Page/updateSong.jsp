<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Update Song</title>
        <link rel="stylesheet" href="../style.css" type="text/css">
    </head>
    <body>
        <h1>Update Existing Song</h1>
        <p>Modify the details of a previously uploaded song.</p>

        <form class="form-container" action="#" method="post">
            <div class="form-group">
                <label for="songId">Song ID</label>
                <input type="text" id="songId" name="songId" required>
            </div>

            <div class="form-group">
                <label for="songTitle">New Song Title</label>
                <input type="text" id="songTitle" name="songTitle">
            </div>

            <div class="form-group">
                <label for="duration">New Duration</label>
                <input type="text" id="duration" name="duration">
            </div>

            <div class="form-group">
                <label for="genre">New Genre</label>
                <input type="text" id="genre" name="genre">
            </div>

            <div class="form-group">
                <label for="releaseDate">New Release Date</label>
                <input type="date" id="releaseDate" name="releaseDate">
            </div>

            <button type="submit" class="btn">Update Song</button>
            
            <div class="link-container">
                <p><a class="form-link" href="../DashBoard/dashboard.jsp">Back to Dashboard</a></p>
            </div>
        </form>
    </body>
</html>
