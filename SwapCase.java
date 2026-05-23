public class SwapCase {
    public static String swapCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') result += (char)(ch + 32);
            else if (ch >= 'a' && ch <= 'z') result += (char)(ch - 32);
            else result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(swapCase("Hello World"));
    }
}
