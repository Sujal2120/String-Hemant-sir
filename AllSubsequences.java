public class AllSubsequences {
    public static void subsequences(String s, String current, int index) {
        if (index == s.length()) {
            if (!current.isEmpty()) System.out.println(current);
            return;
        }
        subsequences(s, current + s.charAt(index), index + 1);
        subsequences(s, current, index + 1);
    }

    public static void main(String[] args) {
        subsequences("abc", "", 0);
    }
}
