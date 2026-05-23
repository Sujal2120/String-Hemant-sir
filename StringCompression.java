public class StringCompression {
    public static String compress(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }
            result += ch + "" + count;
        }
        return result.length() < s.length() ? result : s;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabb"));
        System.out.println(compress("aabbcc"));
        System.out.println(compress("abc"));
    }
}
