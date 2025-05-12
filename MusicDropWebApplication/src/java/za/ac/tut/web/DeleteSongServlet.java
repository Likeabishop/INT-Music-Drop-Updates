package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.Artist.Entity.Artist;
import za.ac.ejb.Artist.bl.ArtistFacadeLocal;
import za.ac.ejb.Song.Entity.Song;
import za.ac.ejb.Song.bl.SongFacadeLocal;

public class DeleteSongServlet extends HttpServlet {
    @EJB ArtistFacadeLocal artistSB;
    @EJB SongFacadeLocal songSB;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long idNum = Long.parseLong(request.getParameter("id"));
        
        Artist artist = artistSB.find(idNum);
        int pos = Integer.parseInt(request.getParameter("pos"));
        Song song = artist.getSongs().remove(pos);
        
        songSB.remove(song);
        
        response.sendRedirect("dashboard.jsp");
    }

}
