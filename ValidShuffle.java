public class ValidShuffle {
    public static boolean isValidShuffle(String s1, String s2, String result) {
        if (s1.length() + s2.length() != result.length()) return false;
        return isShuffleHelper(s1, 0, s2, 0, result, 0);
    }

    public static boolean isShuffleHelper(String s1, int i, String s2, int j, String res, int k) {
        if (k == res.length()) return i == s1.length() && j == s2.length();
        boolean valid = false;
        if (i < s1.length() && s1.charAt(i) == res.charAt(k)) valid |= isShuffleHelper(s1, i + 1, s2, j, res, k + 1);
        if (j < s2.length() && s2.charAt(j) == res.charAt(k)) valid |= isShuffleHelper(s1, i, s2, j + 1, res, k + 1);
        return valid;
    }

    public static void main(String[] args) {
        System.out.println(isValidShuffle("abc", "def", "adbecf"));
        System.out.println(isValidShuffle("abc", "def", "abcfed"));
    }
}
