<%-- 
    Document   : artist_page
    Created on : 10 May 2025, 2:28:11 PM
    Author     : moren
--%>




<%@page import="java.util.List"%>
<%@page import="za.ac.ejb.Artist.Entity.Artist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artists Page</title>
        <link rel="stylesheet" href="../style.css">
    </head>
    <body>
        <h2>🎤 Artists</h2>

        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Genre</th>
                    <th>Stage Name</th>
                    <th>Email</th>
                    <th>Active Since</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Artist> artists = (List<Artist>) session.getAttribute("artists");
                    if (!artists.isEmpty()) {
                        for (Artist artist : artists) {
                %>
                <tr>
                    <td><%=artist.getFirstname()%></td>
                    <td><%=artist.getLastname()%></td>
                    <td><%=artist.getGenre()%></td>
                    <td><%=artist.getStagename()%></td>
                    <td><%=artist.getEmail()%></td>
                    <td><%=artist.getCreationdate()%></td>
                    <td>
                        <a href="../ViewSong Page/view_songs.jsp?artist=<%=artist.getFirstname()%>" class="btn">🎵 View Songs</a>
                    </td>
                </tr>
                <%
                    }
                } else {
                %>
                <tr>
                    <td colspan="7">No artists found.</td>
                </tr>
                <%
                    }
                %>

            </tbody>
        </table>

        <div class="button-group">
            <a href="../DashBoard/dashboard.jsp" class="btn">🏠 Back to Dashboard</a>
        </div>
    </body>
</html>
