public class ValidParentheses {
    public static void generate(int open, int close, int n, String current) {
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }
        if (open < n) generate(open + 1, close, n, current + "(");
        if (close < open) generate(open, close + 1, n, current + ")");
    }

    public static void main(String[] args) {
        int n = 3;
        generate(0, 0, n, "");
    }
}
