<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Artist Dashboard</title>
        <link rel="stylesheet" href="dashboard.css" type="text/css">
    </head>
    <body>
        <h1>Welcome to Your Artist Dashboard</h1>
        <p>Select an action below to manage your music releases.</p>

        <div class="dashboard-container">
            <div class="card-grid">
                <div class="dashboard-card">
                    <h3>Add New Song</h3>
                    <a href="../AddSong Page/addSong.jsp">Go</a>
                </div>

                <div class="dashboard-card">
                    <h3>Update Song</h3>
                    <a href="../UpdateSong Page/updateSong.jsp">Go</a>
                </div>

                <div class="dashboard-card">
                    <h3>Delete Song</h3>
                    <a href="../DeleteSong Page/deleteSong.jsp">Go</a>
                </div>
            </div>
        </div>
    </body>
</html>
