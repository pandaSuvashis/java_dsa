public class Str {
    public static void main(String[] args) {
        System.out.println("hello strings");
        // chars
        char ch = 's';
        System.out.println(ch + " " + "this is a character");

        // strings : sequence of characters
        // declaration 1
        String s = "panda";
        System.out.println(s + " " + "this is a string");
        // declaration 2
        String name = new String("panda");
        System.out.println(name);

        // lengeth of a string
        System.out.println("Length of string :  " + name.length());
        // accessing the characters
        System.out.println("accessing element from index 2 (index starts from 0  )" + name.charAt(2));

        // print all the characters from the string
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // uppercase and lower case
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // compare strings
        System.out.println(name.equals(s));
        // concat strings
        String con = s + " " + name;
        System.out.println(con);

        // contains
        System.out.println(name.contains("pan"));
        // substring
        System.out.println("\nSubstring: " + name.substring(0, 4));

        // rev a string
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
        // count vowels
        int vowel = 0;
        for (int i = 0; i < name.length(); i++) {
            char chara = Character.toLowerCase(name.charAt(i));
            if (chara == 'a' || chara == 'e' || chara == 'i' || chara == 'o' || chara == 'u') {
                vowel++;
            }
        }
        System.out.println(vowel);
        // palindrome
        String palindrome = "madam";
        String reve = "";
        for (int j = palindrome.length() - 1; j >= 0; j--) {
            reve += palindrome.charAt(j);
        }
        if (palindrome.equals(reve)) {
            System.out.println(true);
        } else
            System.out.println(false);

        // 1d String array
        String languages[] = { "Java", "Python", "C++" };

        System.out.println("\nString Array:");

        for (int i = 0; i < languages.length; i++) {

            System.out.println(languages[i]);
        }

        // 2d string array
        String arr[][] = {
                { "A", "B" },
                { "C", "D" }
        };

        System.out.println("\n2D String Array:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }


        //replace
        String replaceText = "java vs python";
        System.out.println(replaceText.replace("python", "c++"));


           // =====================================================
        // 17. Trim Method
        // =====================================================

        String trimText = "   Hello Java   ";

        System.out.println("\nBefore Trim: '" + trimText + "'");

        System.out.println("After Trim: '" + trimText.trim() + "'");

    }
}