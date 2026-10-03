public class Lab3task4 {
    public static boolean isPalindrome(String s) {
        return isPalindromeRec(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeRec(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindromeRec(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word = "level";
        System.out.println(isPalindrome(word) ? "YES" : "NO"); 
    }
}