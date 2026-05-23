public class CountVowelsConsonants {
    public static void count(String s) {
        String vowels = "aeiouAEIOU";
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }

    public static void main(String[] args) {
        count("Hello World");
    }
}
