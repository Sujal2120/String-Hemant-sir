public class UpperLowerCase {
    public static String toUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') result += (char)(ch - 32);
            else result += ch;
        }
        return result;
    }

    public static String toLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') result += (char)(ch + 32);
            else result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(toUpper(s));
        System.out.println(toLower(s));
    }
}
