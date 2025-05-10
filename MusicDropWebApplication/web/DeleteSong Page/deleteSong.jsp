<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Delete Song</title>
        <link rel="stylesheet" href="deleteSong.css" type="text/css">
    </head>
    <body>
        <h1>Delete Song</h1>
        <p>Enter the Song ID to delete the corresponding song from your catalog.</p>

        <form class="form-container" action="#" method="post">
            <div class="form-group">
                <label for="songId">Song ID</label>
                <input type="text" id="songId" name="songId" required>
            </div>

            <button type="submit" class="btn">Delete Song</button>
            
            <div class="link-container">
                <p><a class="form-link" href="../DashBoard/dashboard.jsp">Back to Dashboard</a></p>
            </div>
        </form>
    </body>
</html>
