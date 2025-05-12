package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import za.ac.ejb.User.Entity.Users;
import za.ac.ejb.User.bl.UserFacadeLocal;


public class AddUserServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form parameters
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        String artist = request.getParameter("artist");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Validate passwords
        if (!userFacade.validateRegistration(password, confirmPassword)) {
            response.getWriter().println("Passwords do not match or are invalid.");
            return;
        }

        // Check if email is already registered
        if (userFacade.isEmailRegistered(email)) {
            response.getWriter().println("Email already registered.");
            return;
        }

        // Create the user
        Users user = createUser(name, surname, age, email, artist, password);
        userFacade.create(user);    

        // Redirect to dashboard
        response.sendRedirect("./ArtistPage/artist_page.jsp");
    }

    // Helper method to create a user object
    private Users createUser(String name, String surname, int age, String email, String artist, String password) {
        Users user = new Users();
        user.setName(name);
        user.setSurname(surname);
        user.setAge(age);
        user.setEmail(email);
        user.setArtist(artist);
        user.setPassword(password);
        user.setCreationDate(new java.util.Date());
        return user;
    }
            
}
