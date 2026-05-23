import java.util.HashMap;

public class PrintDuplicates {
    public static void printDuplicates(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.print("Duplicate characters: ");
        for (char ch : freq.keySet()) {
            if (freq.get(ch) > 1) System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDuplicates("programming");
    }
}
