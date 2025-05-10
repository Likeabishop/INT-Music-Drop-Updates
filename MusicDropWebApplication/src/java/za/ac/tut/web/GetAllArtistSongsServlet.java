package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.Song.bl.SongFacadeLocal;

public class GetAllArtistSongsServlet extends HttpServlet {
    @EJB ArtistFacadeLocal artistSB;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idNum = request.getParameter("idNum");
        
        Artist artist = artistSB.find(idNum);
        
        session.setAttribute("artist");
        
        response.sendRedirect("dashboard.jsp");
    }

}
