package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.Artist.Entity.Artist;
import za.ac.ejb.Artist.bl.ArtistFacadeLocal;
import za.ac.ejb.Song.Entity.Song;
import za.ac.ejb.Song.bl.SongFacadeLocal;

public class EditSongServlet extends HttpServlet {
    @EJB ArtistFacadeLocal artistSB;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String title = request.getParameter("title");
            String strReleaseDate = request.getParameter("releaseDate");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            int pos = Integer.parseInt(request.getParameter("pos"));
            Date releaseDate = dateFormat.parse(strReleaseDate);
            String idNum = request.getParameter("idNum");
        
            Artist artist = artistSB.find(idNum);
            artist.getSongs().get(pos).setTitle(title);
            artist.getSongs().get(pos).setReleaseDate(releaseDate);
        
            artistSB.edit(artist);
        } catch (ParseException ex) {
            Logger.getLogger(EditSongServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("dashboard.jsp");
    }

}
