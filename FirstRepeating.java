import java.util.HashSet;

public class FirstRepeating {
    public static char firstRepeating(String s) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (seen.contains(ch)) return ch;
            seen.add(ch);
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstRepeating("abcdeab"));
    }
}
