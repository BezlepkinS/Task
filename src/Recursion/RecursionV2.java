package Recursion;

public class RecursionV2 {
    public static String recursionV2(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / Рекурсивное условие
        return recursionV2(n - 1) + " " + n;
    }
    public void recursionInfoV2(){
        System.out.println(recursionV2(10));
    }
}
