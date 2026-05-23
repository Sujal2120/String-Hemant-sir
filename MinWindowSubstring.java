import java.util.HashMap;

public class MinWindowSubstring {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);
        int left = 0, matched = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c).equals(need.get(c))) matched++;
            while (matched == need.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                char lc = s.charAt(left);
                window.put(lc, window.get(lc) - 1);
                if (need.containsKey(lc) && window.get(lc) < need.get(lc)) matched--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("a", "a"));
    }
}
