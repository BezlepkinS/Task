package Recurent;

public class Recurent2 {
    public static String recursion2(int a, int b) {
        // Основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion2(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion2(a + 1, b);
        }
    }
    public void recurentinfo21(){
        System.out.println(recursion2(20, 15));
    }
    public void recurentinfo22(){
        System.out.println(recursion2(10, 15));
    }
}
