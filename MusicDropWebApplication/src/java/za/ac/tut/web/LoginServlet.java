/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
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
 * @author moren
 */
public class LoginServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password").trim();

        Users user = userFacade.findByEmail(email);

        String location = "/LoginPage/login.jsp";  // add leading slash
        if (user != null && user.getPassword().equals(password)) {
            response.sendRedirect(request.getContextPath() + "/DashBoard/dashboard.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/LoginPage/login.jsp");
        }
    }

}
