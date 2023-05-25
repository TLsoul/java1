package ij1;

public class Author {
   private String fisrtname;
    private String lastname;

    public Author(String fisrtname, String lastname) {
        this.fisrtname = fisrtname;
        this.lastname = lastname;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fisrtname='" + fisrtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
