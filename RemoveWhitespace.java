public class RemoveWhitespace {
    public static String removeWhitespace(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespace("Hello   World  Java"));
    }
}
