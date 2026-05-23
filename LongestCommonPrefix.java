public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) j++;
            prefix = prefix.substring(0, j);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}
