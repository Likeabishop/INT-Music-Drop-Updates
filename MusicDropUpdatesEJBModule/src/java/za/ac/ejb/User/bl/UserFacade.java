/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.ejb.User.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.ejb.User.Entity.Users;

/**
 *
 * @author mukon
 */
@Stateless
public class UserFacade extends AbstractFacade<Users> implements UserFacadeLocal {

    @PersistenceContext(unitName = "MusicDropUpdatesEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(Users.class);
    }

  @Override
public boolean validateRegistration(String password, String confirmPassword) {
    if (!password.equals(confirmPassword)) {
        return false;
    }

    if (password.length() < 8) {
        return false;
    }

    boolean hasUppercase = false;
    boolean hasLowercase = false;
    boolean hasDigit = false;

    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) hasUppercase = true;
        else if (Character.isLowerCase(c)) hasLowercase = true;
        else if (Character.isDigit(c)) hasDigit = true;
    }

    return hasUppercase && hasLowercase && hasDigit;
}


    @Override
    public boolean isEmailRegistered(String email) 
    {
        
    Query query = em.createQuery("SELECT COUNT(u) FROM Users u WHERE u.email = :email");
    query.setParameter("email", email);
    Long count = (Long) query.getSingleResult();
    return count > 0;
}    

    @Override
    public Users findByEmail(String email) 
    {
        try {
        String jpql = "SELECT u FROM Users u WHERE u.email = :email";
            Query query =  em.createQuery(jpql);
                 query.setParameter("email", email);
                 
           Users user = (Users) query.getSingleResult();
           return  user;
    }    catch (NoResultException e) {
        return null; 
    } 
    }
}
