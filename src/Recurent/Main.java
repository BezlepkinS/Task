package Recurent;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Rec = in.next();

        switch(Rec){
            case("Один"):
                Recurent1 x1 = new Recurent1();
                x1.recurentinfo1(); // Вызов рекурсивной функции
                break;
            case("Два"):
                Recurent2 x2 = new Recurent2();
                x2.recurentinfo21(); // Вызов рекурсивной функции A > B
                break;
            case("Три"):
                Recurent2 x3 = new Recurent2();
                x3.recurentinfo22(); // Вызов рекурсивной функции A < B
                break;
            case("Четыре"):
                Recurent3 x4 = new Recurent3();
                x4.recurentinfo3(); // Вызов рекурсивной функции
                break;
        }
    }

}
