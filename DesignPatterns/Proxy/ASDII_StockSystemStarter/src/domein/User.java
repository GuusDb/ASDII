package domein;

public class User {

    private String naam;
    private boolean isAdmin;

    public User(String naam, boolean isAdmin) {
        this.naam = naam;
        this.isAdmin = isAdmin;
    }
    public String getNaam(){
        return naam;
    }

     public boolean getIsAdmin(){
        return isAdmin;
    }
}