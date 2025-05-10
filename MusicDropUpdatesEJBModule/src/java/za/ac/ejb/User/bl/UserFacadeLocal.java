/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.ejb.User.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.ejb.User.Entity.User;

/**
 *
 * @author mukon
 */
@Local
public interface UserFacadeLocal {

    void create(User user);

    void edit(User user);

    void remove(User user);

    User find(Object id);

    List<User> findAll();

    List<User> findRange(int[] range);

    int count();
    
   public boolean validateRegistration(String password, String confirmPassword);
   public boolean isEmailRegistered(String email);
   
   User findByEmail(String email);



    
}
