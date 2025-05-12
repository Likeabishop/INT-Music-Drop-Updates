package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.ejb.Artist.Entity.Artist;
import za.ac.ejb.Artist.bl.ArtistFacadeLocal;

public class GetAllArtistsServlet extends HttpServlet {

    @EJB
    private ArtistFacadeLocal artistSB;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Artist> artists = artistSB.findAll();
        System.out.println("artists:" + artists);

// Store in session instead of request
        HttpSession session = request.getSession();
        session.setAttribute("artists", artists);

// Now redirect — works because data is in session
        response.sendRedirect("ArtistPage/artist_page.jsp");
    }
}
