public class Lab3task3 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        int d = n - 1;
        int s = 0;
        while (d % 2 == 0) {
            d /= 2;
            s++;
        }

        // Для int достаточно этих оснований
        int[] bases = {2, 3, 5, 7, 11};
        for (int a : bases) {
            if (a >= n) continue;
            if (!millerTest(a, d, s, n)) return false;
        }
        return true;
    }

    private static boolean millerTest(int a, int d, int s, int n) {
        long x = modPow(a, d, n);
        if (x == 1 || x == n - 1) return true;
        for (int r = 1; r < s; r++) {
            x = (x * x) % n;
            if (x == n - 1) return true;
        }
        return false;
    }

    private static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n) ? "YES" : "NO"); // YES
    }
}