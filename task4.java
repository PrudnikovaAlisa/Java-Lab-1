public class task4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double number = Math.random();
            System.out.println(number);
            sum += number;
        }

        double average = sum / n;

        System.out.println("Average: " + average);
    }
}