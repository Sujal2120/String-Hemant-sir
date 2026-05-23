import java.util.LinkedHashMap;

public class FirstNonRepeating {
    public static char firstNonRepeating(String s) {
        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freq.keySet()) {
            if (freq.get(ch) == 1) return ch;
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("aabbcde"));
    }
}
