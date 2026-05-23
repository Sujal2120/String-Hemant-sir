public class ReplaceSpaces {
    public static String replaceSpaces(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') result += '-';
            else result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpaces("Hello World Java"));
    }
}
