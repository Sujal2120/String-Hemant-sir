import java.util.HashSet;

public class CountDistinctSubstrings {
    public static int countDistinctSubstrings(String s) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                set.add(s.substring(i, j));
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(countDistinctSubstrings("abc"));
        System.out.println(countDistinctSubstrings("aab"));
    }
}
