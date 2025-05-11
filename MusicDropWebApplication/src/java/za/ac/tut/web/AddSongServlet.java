package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.Artist.bl.ArtistFacadeLocal;
import za.ac.ejb.Song.Entity.Song;
import za.ac.ejb.Song.bl.SongFacadeLocal;

public class AddSongServlet extends HttpServlet {
    @EJB ArtistFacadeLocal artistSB;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String title = request.getParameter("title");
            String strDuration = request.getParameter("duration");
            Double duration = Double.parseDouble(strDuration);
            String genre = request.getParameter("genre");
            String strReleaseDate = request.getParameter("releaseDate");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            Date releaseDate = dateFormat.parse(strReleaseDate);
            
            Song song = CreateSong(title, duration, genre, releaseDate);
            String idNum = request.getParameter("idNum");
            
            Artist artist = artistSB.Find(idNum);
            artist.getSongs().add(song);
            
            artistSB.edit(artist);
        
            response.sendRedirect("dashboard.jsp");
        } catch (ParseException ex) {
            Logger.getLogger(AddSongServlet.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    private Song CreateSong(String title, Double duration, String genre, Date releaseDate) {
        Song s = new Song();
        
        s.setDuration(duration);
        s.setGenre(genre);
        s.setReleaseDate(releaseDate);
        s.setCreationDate(new Date());
        s.setTitle(title);
        
        return s;
    }
}
