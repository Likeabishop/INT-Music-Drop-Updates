/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.ejb.Artist.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import za.ac.ejb.Song.Entity.Song;

/**
 *
 * @author Bongani
 */
@Entity
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_NUMBER")
    private String id;
    private String firstname;
    private String lastname;
    private String stagename;
    private String genre;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "artist_songs",joinColumns = @JoinColumn(name = "artist_fk"),inverseJoinColumns = @JoinColumn(name="song_fk"))
    private List<Song> songs;
    @Column(name = "DATE_AND_TIME_REGISTERED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationdate;

    public Artist() {
    }

    public Artist(String id, String firstname, String lastname, String stagename, String genre, String email, String password, Date creationdate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.stagename = stagename;
        this.genre = genre;
        this.email = email;
        this.password = password;
        
        this.creationdate = creationdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStagename() {
        return stagename;
    }

    public void setStagename(String stagename) {
        this.stagename = stagename;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }
    
    
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artist)) {
            return false;
        }
        Artist other = (Artist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.ejb.Artist.Entity.Artist[ id=" + id + " ]";
    }
    
}
