public class LargestWord {
    public static String largestWord(String s) {
        String[] words = s.split(" ");
        String largest = "";
        for (String word : words) {
            if (word.length() > largest.length()) largest = word;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(largestWord("Hello beautiful World"));
    }
}
