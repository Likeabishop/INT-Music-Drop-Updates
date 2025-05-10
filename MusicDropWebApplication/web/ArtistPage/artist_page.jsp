<%-- 
    Document   : artist_page
    Created on : 10 May 2025, 2:28:11 PM
    Author     : moren
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artists Page</title>
        <link rel="stylesheet" href="artist_page.css">
    </head>
    <body>
        <h2>🎤 Artists</h2>
        <%--
            // Dummy artist data (to be replaced by Artist class and DAO later)
            class DummyArtist {

                String name, genre, country;
                int debutYear, albums;

                DummyArtist(String name, String genre, String country, int debutYear, int albums) {
                    this.name = name;
                    this.genre = genre;
                    this.country = country;
                    this.debutYear = debutYear;
                    this.albums = albums;
                }
            }

            java.util.List<DummyArtist> artistList = new java.util.ArrayList<>();
            artistList.add(new DummyArtist("Adele", "Pop", "UK", 2006, 4));
            artistList.add(new DummyArtist("Kendrick Lamar", "Hip Hop", "USA", 2011, 5));
            artistList.add(new DummyArtist("BTS", "K-Pop", "South Korea", 2013, 9));
            artistList.add(new DummyArtist("Coldplay", "Alternative Rock", "UK", 2000, 8));
            artistList.add(new DummyArtist("Taylor Swift", "Pop/Country", "USA", 2006, 10));

            request.setAttribute("artists", artistList);
        --%>

    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Genre</th>
                <th>Country</th>
                <th>Debut Year</th>
                <th>Albums</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="artist" items="${artists}">
                <tr>
                    <td>${artist.name}</td>
                    <td>${artist.genre}</td>
                    <td>${artist.country}</td>
                    <td>${artist.debutYear}</td>
                    <td>${artist.albums}</td>
                    <td>
                        <a href="../ViewSong Page/view_songs.jsp?artist=${artist.name}" class="btn">🎵 View Songs</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="button-group">
        <a href="dashboard.jsp" class="btn">🏠 Back to Dashboard</a>
    </div>
</body>
</html>
