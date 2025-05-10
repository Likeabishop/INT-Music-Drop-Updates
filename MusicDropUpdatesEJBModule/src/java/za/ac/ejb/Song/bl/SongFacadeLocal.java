package za.ac.ejb.Song.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.ejb.Song.Entity.Song;

@Local
public interface SongFacadeLocal {

    void create(Song song);

    void edit(Song song);

    void remove(Song song);

    Song find(Object id);

    List<Song> findAll();

    List<Song> findRange(int[] range);

    int count();
    
}
