/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.ejb.Artist.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.ejb.Artist.Entity.Artist;

/**
 *
 * @author Bongani
 */
@Stateless
public class ArtistFacade extends AbstractFacade<Artist> implements ArtistFacadeLocal {

    @PersistenceContext(unitName = "MusicDropUpdatesEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArtistFacade() {
        super(Artist.class);
    }

    @Override
    public String getEmail(String email) {
       Query query = em.createQuery("SELECT a.email FROM Artist a WHERE a.email = ?1");
       query.setParameter(1, email);
       String emls = (String)query.getSingleResult();
       return emls;
    }

    @Override
    public String getPassword(String password) {
       Query query = em.createQuery("SELECT a.password FROM Artist a WHERE a.password = ?1");
       query.setParameter(1, password);
       String emls = (String)query.getSingleResult();
       return emls;
    }
    
}
