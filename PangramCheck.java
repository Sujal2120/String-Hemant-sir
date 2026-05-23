public class PangramCheck {
    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') seen[ch - 'a'] = true;
        }
        for (boolean b : seen) if (!b) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("Hello World"));
    }
}
