package za.ac.tut.bl;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.User.bl.UserFacadeLocal;

public class PasswordResetServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        
        if (userFacade.isEmailRegistered(email)) {
           
            RequestDispatcher dispatcher =   request.getRequestDispatcher("update_password.jsp");
             dispatcher.forward(request, response);
        } else {
         RequestDispatcher dispatcher =   request.getRequestDispatcher("reset_password.jsp");
             dispatcher.forward(request, response);
        }
    }
}