public class MinFlipsBinaryString {
    public static int minFlips(String s) {
        int n = s.length();
        int flips1 = 0, flips2 = 0;
        for (int i = 0; i < n; i++) {
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != expected1) flips1++;
            if (s.charAt(i) != expected2) flips2++;
        }
        return Math.min(flips1, flips2);
    }

    public static void main(String[] args) {
        System.out.println(minFlips("0001010111"));
        System.out.println(minFlips("010"));
    }
}
