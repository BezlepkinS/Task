package Recursion;

public class RecursionV3 {
    public static String recursionV3(int a, int b) {
        // Основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / Рекурсивное условие
            return a + " " + recursionV3(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / Рекурсивное условие
            return a + " " + recursionV3(a + 1, b);
        }
    }
    public void recursionInfoV3E1(){
        System.out.println(recursionV3(20, 15));
    }
    public void recursionInfoV3E2(){
        System.out.println(recursionV3(10, 15));
    }
}
