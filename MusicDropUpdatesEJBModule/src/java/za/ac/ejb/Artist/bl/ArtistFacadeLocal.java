/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.ejb.Artist.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.ejb.Artist.Entity.Artist;

/**
 *
 * @author Bongani
 */
@Local
public interface ArtistFacadeLocal {

    void create(Artist artist);

    void edit(Artist artist);

    void remove(Artist artist);

    Artist find(Object id);

    List<Artist> findAll();

    List<Artist> findRange(int[] range);

    int count();
    
    //JPQL
    
    String getEmail(String email);
    
    String getPassword(String password);
    
}
