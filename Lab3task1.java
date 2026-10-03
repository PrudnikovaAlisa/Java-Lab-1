import java.util.Arrays;

public class Lab3task1 {
    public static int[] removeOccurrences(int[] arr, int value) {
        int count = 0;
        for (int x : arr) {
            if (x == value) count++;
        }
        int[] result = new int[arr.length - count];
        int index = 0;
        for (int x : arr) {
            if (x != value) {
                result[index++] = x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int value = 2;
        int[] res = removeOccurrences(arr, value);
        System.out.println(Arrays.toString(res));
    }
}