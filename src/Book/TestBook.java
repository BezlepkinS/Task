package Book;
import java.lang.*;

public class TestBook {
    public static void main(String[] args)
    {
        Book b1 =  new Book("Comedy", "Bunin");
        Book b2 =  new Book("Detective", "Doyle");
        Book b3 =  new Book("Romance");
        b3.setAuthor("Shakespeare");
        System.out.println(b1);
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
