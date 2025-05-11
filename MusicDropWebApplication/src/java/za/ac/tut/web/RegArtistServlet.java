/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.Artist.Entity.Artist;
import za.ac.ejb.Artist.bl.ArtistFacadeLocal;


/**
 *
 * @author Bongani
 */
public class RegArtistServlet extends HttpServlet {
@EJB ArtistFacadeLocal afl; 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idNom = "12357890987";
        String firstname = "Bongani";
        String lastname = "Maduna";
        String stagename = "SugerDaddy_Potsotso_";
        String genre = "LetebelePotsotso";
        String email ="scrutenice31314@gmail.com";
        String password ="&!@32BongsLebanta";
        
        
        Artist art = createArtist(idNom,firstname,lastname,stagename,genre,email,password);
        afl.create(art);
        
        //request.setAttribute("firstname",firstname);
        
        response.sendRedirect("dashboard.jsp");
    }

    private Artist createArtist(String idNom, String firstname, String lastname, String stagename, String genre, String email, String password) {
      Artist art = new Artist();
      
      
      art.setId(idNom);
      art.setFirstname(firstname);
      art.setLastname(lastname);
      art.setStagename(stagename);
      art.setGenre(genre);
      art.setEmail(email);
      art.setPassword(password);
      art.setCreationdate(new Date());
      return art;
    }

}
