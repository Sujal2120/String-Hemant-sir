import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) seen.add(s.charAt(i));
        String result = "";
        for (char ch : seen) result += ch;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}
