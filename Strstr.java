public class Strstr {
    public static int strstr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int h = haystack.length(), n = needle.length();
        for (int i = 0; i <= h - n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) j++;
            if (j == n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strstr("hello world", "world"));
        System.out.println(strstr("hello world", "xyz"));
    }
}
