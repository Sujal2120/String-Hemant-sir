import java.util.HashMap;

public class CharFrequency {
    public static void countFrequency(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freq.keySet()) {
            System.out.println("'" + ch + "': " + freq.get(ch));
        }
    }

    public static void main(String[] args) {
        countFrequency("hello world");
    }
}
