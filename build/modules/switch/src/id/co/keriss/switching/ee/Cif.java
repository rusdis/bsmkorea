package id.co.keriss.switching.ee;
// Generated Jun 17, 2015 9:38:51 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import org.jpos.ee.User;

/**
 * Cif generated by hbm2java
 */
public class Cif  implements java.io.Serializable {


     private Long id;
     private String name;
     private String birthplace;
     private String birthdate;
     private String koreanhp;
     private String koreanaddr;
     private String facebookid;
     private String email;
     private String identificationpaper;
     private String idtype;
     private String mothername;
     private String fathername;
     private String indonesiaaddr;
     private User user;
     private Set attachment = new HashSet(0);

    public Cif() {
    }

    public Cif(String name, String birthplace, String birthdate, String koreanhp, String koreanaddr, String facebookid, String email, String identificationpaper, String idtype, String mothername, String fathername, String indonesiaaddr, User user, Set attachment) {
       this.name = name;
       this.birthplace = birthplace;
       this.birthdate = birthdate;
       this.koreanhp = koreanhp;
       this.koreanaddr = koreanaddr;
       this.facebookid = facebookid;
       this.email = email;
       this.identificationpaper = identificationpaper;
       this.idtype = idtype;
       this.mothername = mothername;
       this.fathername = fathername;
       this.indonesiaaddr = indonesiaaddr;
       this.user = user;
       this.attachment = attachment;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthplace() {
        return this.birthplace;
    }
    
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    public String getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public String getKoreanhp() {
        return this.koreanhp;
    }
    
    public void setKoreanhp(String koreanhp) {
        this.koreanhp = koreanhp;
    }
    public String getKoreanaddr() {
        return this.koreanaddr;
    }
    
    public void setKoreanaddr(String koreanaddr) {
        this.koreanaddr = koreanaddr;
    }
    public String getFacebookid() {
        return this.facebookid;
    }
    
    public void setFacebookid(String facebookid) {
        this.facebookid = facebookid;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIdentificationpaper() {
        return this.identificationpaper;
    }
    
    public void setIdentificationpaper(String identificationpaper) {
        this.identificationpaper = identificationpaper;
    }
    public String getIdtype() {
        return this.idtype;
    }
    
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    public String getMothername() {
        return this.mothername;
    }
    
    public void setMothername(String mothername) {
        this.mothername = mothername;
    }
    public String getFathername() {
        return this.fathername;
    }
    
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }
    public String getIndonesiaaddr() {
        return this.indonesiaaddr;
    }
    
    public void setIndonesiaaddr(String indonesiaaddr) {
        this.indonesiaaddr = indonesiaaddr;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Set getAttachment() {
        return this.attachment;
    }
    
    public void setAttachment(Set attachment) {
        this.attachment = attachment;
    }




}


