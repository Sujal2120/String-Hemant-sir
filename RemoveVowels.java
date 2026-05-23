public class RemoveVowels {
    public static String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("Hello World"));
    }
}
