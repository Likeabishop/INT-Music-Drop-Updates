/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;

import java.util.Date;
import javax.ejb.EJB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.ejb.Artist.Entity.Artist;
import za.ac.ejb.Artist.bl.ArtistFacadeLocal;

/**
 *
 * @author Bongani
 */
public class RegArtistServlet extends HttpServlet {

    @EJB
    ArtistFacadeLocal afl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        try {
            Long idNom = Long.parseLong(request.getParameter("id"));
            String firstname = request.getParameter("name");
            String lastname = request.getParameter("artistSurname");
            String stagename = request.getParameter("artistStageName");
            String genre = request.getParameter("genre");
            String email = request.getParameter("email");
            String password = request.getParameter("adminPassword");

            if (firstname != null && lastname != null && email != null && password != null) {
                Artist artist = createArtist(idNom, firstname, lastname, stagename, genre, email, password);
                afl.create(artist);
                session.setAttribute("artist", artist);
                response.sendRedirect("DashBoard/dashboard.jsp?status=success&message=Artist+created+successfully");
            } else {
                // Redirect back to the form if any critical fields are missing
                response.sendRedirect("ArtistPage/artist_form.jsp?error=Missing+required+fields");
            }

        } catch (NumberFormatException e) {
            // Redirect with error if id is not a valid number
            response.sendRedirect("ArtistPage/artist_form.jsp?error=Invalid+ID+format");
        } catch (Exception e) {
            // Generic error catch
            e.printStackTrace(); // For debugging only — remove or log properly in production
            response.sendRedirect("ArtistPage/artist_form.jsp?error=An+unexpected+error+occurred");
        }
    }

    private Artist createArtist(Long idNom, String firstname, String lastname, String stagename, String genre, String email, String password) {
        Artist artist = new Artist();
        artist.setId(idNom);
        artist.setFirstname(firstname);
        artist.setLastname(lastname);
        artist.setStagename(stagename);
        artist.setGenre(genre);
        artist.setEmail(email);
        artist.setPassword(password);
        artist.setCreationdate(new Date());
        return artist;
    }

}
