package Recursion;

public class RecursionV4 {
    public static int recursionV4(int length, int summary, int k, int s) {
        // Базовый случай
        if (length == k) {
            if (summary == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (length == 0 ? 1 : 0);
        int result = 0;
        // Шаг рекурсии / Рекурсивное условие
        for (int i = c; i < 10; i++) {
            result += recursionV4(length + 1, summary + i, k, s);
        }
        return result;
    }
    public void recursionInfoV4() {
        System.out.println(recursionV4(0, 0, 3, 15));
    }
}
