import java.util.HashSet;

public class LongestSubstringNoRepeat {
    public static String longestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, maxStart = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                maxStart = left;
            }
        }
        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(longestSubstring("pwwkew"));
    }
}
