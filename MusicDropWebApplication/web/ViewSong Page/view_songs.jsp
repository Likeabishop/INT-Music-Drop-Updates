<%-- 
    Document   : view_songs.jsp
    Created on : 10 May 2025, 1:05:58 PM
    Author     : moren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Songs Page</title>
        <link rel="stylesheet" href="view_songs.css">
    </head>
    <body>
    <h2>🎵 All Songs</h2>

    <table>
        <thead>
            <tr>
                <th>Title</th>
                <th>Artist</th>
                <th>Album</th>
                <th>Duration</th>
                <th>Date Added</th>
                <th>Added By</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="song" items="${songs}">
                <tr>
                    <td>Let Me Love You</td><%--${song.title}--%>
                    <td>Mario</td><%--${song.artist}--%>
                    <td>Let Me Love You</td><%--${song.album}--%>
                    <td>4 min 16 sec</td> <%--${song.duration}--%>
                    <td>2004</td> <%--${song.dateAdded}--%>
                    <td>Mario</td> <%--${song.addedBy}--%>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="button-group">
        <a href="../ArtistPage/artist_page.jsp" class="btn">🏠 Back to Artists</a>
    </div>

</body>

</body>
</html>
