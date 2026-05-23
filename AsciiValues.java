public class AsciiValues {
    public static void printAscii(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("'" + s.charAt(i) + "' -> " + (int) s.charAt(i));
        }
    }

    public static void main(String[] args) {
        printAscii("Hello");
    }
}
