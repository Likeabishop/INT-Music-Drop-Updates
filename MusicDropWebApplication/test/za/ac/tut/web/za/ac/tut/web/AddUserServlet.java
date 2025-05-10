package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import za.ac.ejb.User.Entity.User;
import za.ac.ejb.User.bl.UserFacadeLocal;


public class AddUserServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        String artist = request.getParameter("artist");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (!userFacade.validateRegistration(password, confirmPassword)) {
            response.getWriter().println("Passwords do not match");
            return;
        }

        if (userFacade.isEmailRegistered(email)) {
            response.getWriter().println("Email already registered");
            return;
        }

        
        User user  = createUser(name,surname,age,email,artist,password);       
       
               userFacade.create(user);  

         RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
          dispatcher.forward(request, response);    
    }
    
    private User createUser(String name,String surname,int age,String email,String artist,String password)
    {
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setAge(age);
        user.setEmail(email);
        user.setArtist(artist);
        user.setPassword(password);
        user.setCreationDate(new Date());
        
        return user;
    }
            
}
