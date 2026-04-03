public class conditionals {
    public static void main(String[] args) {
        System.out.println("LEARNING CONDITIONAL STATEMENTS");

        int a = 10, b = 20;
        System.out.println("a: "+ a+ " b: "+ b);
        // 1. if statement
        System.out.println("1. if statement:");
        if (a < b) {
            System.out.println("a is less than b");
        }

        // 2. if-else statement
        System.out.println("\n2. if-else statement:");
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // 3. if-else if-else ladder
        int marks = 75;
        System.out.println("\n3. if-else if-else ladder:");
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4. Nested if
        int age = 20;
        boolean hasID = true;
        System.out.println("\n4. Nested if:");
        if (age >= 18) {
            if (hasID) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Not eligible to vote");
        }

        // 5. switch statement
        int day = 3;
        System.out.println("\n5. switch statement:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 6. Ternary operator (short if-else)
        System.out.println("\n6. Ternary operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
    
}
