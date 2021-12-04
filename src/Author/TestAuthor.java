package Author;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author a1 =  new Author("Julia", "julia@mail.ru", false);
        Author a2 =  new Author("Anton", "anton@mail.ru", true);
        Author a3 =  new Author("Nikita", "nikita@mail.ru");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
