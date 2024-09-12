package hw3;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAuthenticate = true;
        this.isAdmin = isAdmin;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return isAuthenticate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAuthenticate=" + isAuthenticate +
                ", isAdmin=" + isAdmin +
                '}';
    }
}