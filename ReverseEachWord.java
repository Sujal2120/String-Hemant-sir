public class ReverseEachWord {
    public static String reverseEachWord(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder rev = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) rev.append(word.charAt(i));
            result.append(rev).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Hello World Java"));
    }
}
