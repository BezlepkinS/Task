package Author;
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, boolean male)
    {
        this.name = name;
        this.email = email;
        if (male) gender = 'M';
        else gender = 'F';
    }
    public Author (String name, String email)
    {
        this.name = name;
        this.email = email;
        gender = 'U';
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.gender + ") at " + this.email;
    }
}
