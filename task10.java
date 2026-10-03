public class task10 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int[] numbers = {a, b, c, d, e};

        java.util.Arrays.sort(numbers);

        System.out.println(numbers[2]);
    }
}