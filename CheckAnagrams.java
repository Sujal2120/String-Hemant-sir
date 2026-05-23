public class CheckAnagrams {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) freq[s1.charAt(i)]++;
        for (int i = 0; i < s2.length(); i++) {
            if (freq[s2.charAt(i)] == 0) return false;
            freq[s2.charAt(i)]--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "world"));
    }
}
