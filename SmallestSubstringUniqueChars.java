import java.util.HashMap;
import java.util.HashSet;

public class SmallestSubstringUniqueChars {
    public static String smallestSubstring(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) uniqueChars.add(c);
        int required = uniqueChars.size();
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, matched = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (window.get(c) == 1) matched++;
            while (matched == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                char lc = s.charAt(left);
                window.put(lc, window.get(lc) - 1);
                if (window.get(lc) == 0) matched--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        System.out.println(smallestSubstring("aabcbcdbca"));
        System.out.println(smallestSubstring("aabc"));
    }
}
