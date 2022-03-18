package Recursion;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Rec = in.next();

        switch(Rec){
            case("ВтУпр"):
                RecursionV2 rec2 = new RecursionV2();
                rec2.recursionInfoV2(); // Вызов рекурсивной функции
            case("ТрУпрПерСл"):
                RecursionV3 rec3 = new RecursionV3();
                rec3.recursionInfoV3E1(); // Вызов рекурсивной функции A > B
            case("ТрУпрВтСл"):
                RecursionV3 rec4 = new RecursionV3();
                rec4.recursionInfoV3E2(); // Вызов рекурсивной функции A < B
            case("ЧетУпр"):
                RecursionV4 rec5 = new RecursionV4();
                rec5.recursionInfoV4(); // Вызов рекурсивной функции
                break;
        }
    }
}
