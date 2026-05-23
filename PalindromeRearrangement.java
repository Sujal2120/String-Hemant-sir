import java.util.HashMap;

public class PalindromeRearrangement {
    public static boolean canFormPalindrome(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) oddCount++;
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome("aabb"));
        System.out.println(canFormPalindrome("aabbc"));
        System.out.println(canFormPalindrome("abc"));
    }
}
