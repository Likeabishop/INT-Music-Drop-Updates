package za.ac.ejb.Song.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.ejb.Song.Entity.Song;

@Stateless
public class SongFacade extends AbstractFacade<Song> implements SongFacadeLocal {

    @PersistenceContext(unitName = "MusicDropUpdatesEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SongFacade() {
        super(Song.class);
    }
    
}
