package Recurent;

public class Recurent1 {
    public static String recursion1(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion1(n - 1) + " " + n;
    }
    public void recurentinfo1(){
        System.out.println(recursion1(10));
    }
}
