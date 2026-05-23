public class RunLengthEncoding {
    public static String encode(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }
            result += count + "" + ch;
        }
        return result;
    }

    public static String decode(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            int count = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }
            char ch = s.charAt(i++);
            for (int j = 0; j < count; j++) result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        String encoded = encode("aaabbbcc");
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decode(encoded));
    }
}
