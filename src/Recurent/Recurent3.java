package Recurent;

public class Recurent3 {
    public static int recursion3(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += recursion3(len + 1, sum + i, k, s);
        }
        return res;
    }
    public void recurentinfo3() {
        System.out.println(recursion3(0, 0, 3, 15));
    }
}
