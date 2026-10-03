public class Lab3task2 {
    public static double lnFactorial(int n) {
        if (n <= 1) return 0.0; // ln(1!) = 0, ln(0!) = 0
        return Math.log(n) + lnFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(lnFactorial(n)); // ≈ 4.787
    }
}