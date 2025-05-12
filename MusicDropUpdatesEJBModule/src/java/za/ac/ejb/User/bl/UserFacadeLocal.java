/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.ejb.User.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.ejb.User.Entity.Users;

/**
 *
 * @author mukon
 */
@Local
public interface UserFacadeLocal {

    void create(Users user);

    void edit(Users user);

    void remove(Users user);

    Users find(Object id);

    List<Users> findAll();

    List<Users> findRange(int[] range);

    int count();
    
   public boolean validateRegistration(String password, String confirmPassword);
   public boolean isEmailRegistered(String email);
   
   Users findByEmail(String email);



    
}
