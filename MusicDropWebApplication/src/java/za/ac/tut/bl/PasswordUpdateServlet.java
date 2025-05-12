/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.bl;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.User.Entity.Users;
import za.ac.ejb.User.bl.UserFacadeLocal;

/**
 *
 * @author mukon
 */
public class PasswordUpdateServlet extends HttpServlet {

   
@EJB
private UserFacadeLocal userFacade;

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
    String email = request.getParameter("email");
    String newPassword = request.getParameter("newPassword");
    String confirmPassword = request.getParameter("confirmPassword");
    
    if (!userFacade.validateRegistration(newPassword, confirmPassword)) {
        
      
    RequestDispatcher dispatcher =     request.getRequestDispatcher("update_password.jsp");
     dispatcher.forward(request, response); 
                 return; 

    }
    
  
    
    Users user = userFacade.findByEmail(email);
    if (user != null) {
        user.setPassword(newPassword);
        userFacade.edit(user);
        
       RequestDispatcher dispatcher =  request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    } else {
       RequestDispatcher dispatcher = request.getRequestDispatcher("reset_password.jsp");
        dispatcher.forward(request, response);
    }
    }

 
}
