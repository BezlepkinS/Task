package Book;
import java.lang.*;

public class TestBook {
    public static void main(String[] args)
    {
        Book b1 =  new Book("comedy", "Bunin");
        Book b2 =  new Book("detective", "Doyle");
        Book b3 =  new Book("romance");
        b3.setAuthor("Shakespeare");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
