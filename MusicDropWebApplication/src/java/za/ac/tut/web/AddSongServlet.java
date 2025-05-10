package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.Song.Entity.Song;
import za.ac.ejb.Song.bl.SongFacadeLocal;

public class AddSongServlet extends HttpServlet {
    @EJB SongFacadeLocal songSB;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String strDuration = request.getParameter("title");
        Double duration = Double.parseDouble(strDuration);
        String genre = request.getParameter("genre");
        
        Song song = CreateSong(title, duration, genre);
        
        songSB.create(song);
        
        response.sendRedirect("dashboard.jsp");
    }

    private Song CreateSong(String title, Double duration, String genre) {
        Song s = new Song();
        
        s.setDuration(duration);
        s.setGenre(genre);
        s.setReleaseDate(new Date());
        s.setTitle(title);
        
        return s;
    }

}
