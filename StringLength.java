public class StringLength {
    public static int stringLength(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringLength("Hello World"));
    }
}
