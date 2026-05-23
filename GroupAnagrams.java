import java.util.*;

public class GroupAnagrams {
    public static Map<String, List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> groups = groupAnagrams(words);
        for (List<String> group : groups.values()) {
            System.out.println(group);
        }
    }
}
