public class SmallestWord {
    public static String smallestWord(String s) {
        String[] words = s.split(" ");
        String smallest = words[0];
        for (String word : words) {
            if (word.length() < smallest.length()) smallest = word;
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(smallestWord("Hello beautiful World at Java"));
    }
}
