public class CheckRotations {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String doubled = s1 + s1;
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(areRotations("abcde", "cdeab"));
        System.out.println(areRotations("abcde", "abced"));
    }
}
