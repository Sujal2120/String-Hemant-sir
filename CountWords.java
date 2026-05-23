public class CountWords {
    public static int countWords(String s) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !inWord) {
                inWord = true;
                count++;
            } else if (s.charAt(i) == ' ') {
                inWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hello World this is Java"));
    }
}
