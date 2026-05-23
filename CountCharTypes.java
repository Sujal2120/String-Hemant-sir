public class CountCharTypes {
    public static void countCharTypes(String s) {
        int upper = 0, lower = 0, digits = 0, special = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') upper++;
            else if (ch >= 'a' && ch <= 'z') lower++;
            else if (ch >= '0' && ch <= '9') digits++;
            else special++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }

    public static void main(String[] args) {
        countCharTypes("Hello World! 123");
    }
}
