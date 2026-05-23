public class OnlyDigits {
    public static boolean containsOnlyDigits(String s) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("123456"));
        System.out.println(containsOnlyDigits("123abc"));
    }
}
