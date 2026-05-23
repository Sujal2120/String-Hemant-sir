public class AllPermutations {
    public static void permutations(String s, String current) {
        if (s.isEmpty()) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            permutations(remaining, current + ch);
        }
    }

    public static void main(String[] args) {
        permutations("abc", "");
    }
}
