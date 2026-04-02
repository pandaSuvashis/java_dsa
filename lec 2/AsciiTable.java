public class AsciiTable {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-20s%n", "Category", "Range", "Examples");
        System.out.println("------------------------------------------------------------");

        System.out.printf("%-20s %-15s %-20s%n", "Digits", "48 - 57", "'0' = 48, '9' = 57");
        System.out.printf("%-20s %-15s %-20s%n", "Uppercase Letters", "65 - 90", "'A' = 65, 'Z' = 90");
        System.out.printf("%-20s %-15s %-20s%n", "Lowercase Letters", "97 - 122", "'a' = 97, 'z' = 122");
        System.out.printf("%-20s %-15s %-20s%n", "Control Characters", "0 - 31 & 127", "Tab = 9, LF = 10, CR = 13");
        System.out.printf("%-20s %-15s %-20s%n", "Special Characters", "32 - 47, 58 - 64", "Space = 32, '!' = 33, '@' = 64");

        System.out.println("------------------------------------------------------------");
    }
}