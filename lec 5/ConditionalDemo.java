public class ConditionalDemo {
    public static void main(String[] args) {

        int age = 20;
        int number = 7;
        int marks = 82;
        boolean hasID = true;
        int a = 15, b = 25;
        int day = 2;

        // 1) IF Statement
        if (age >= 18) {
            System.out.println("IF: Eligible to vote");
        }

        // 2) IF-ELSE Statement
        if (number % 2 == 0) {
            System.out.println("IF-ELSE: Even number");
        } else {
            System.out.println("IF-ELSE: Odd number");
        }

        // 3) IF-ELSE-IF Ladder
        if (marks >= 90) {
            System.out.println("IF-ELSE-IF: Grade A");
        } else if (marks >= 75) {
            System.out.println("IF-ELSE-IF: Grade B");
        } else if (marks >= 50) {
            System.out.println("IF-ELSE-IF: Grade C");
        } else {
            System.out.println("IF-ELSE-IF: Fail");
        }

        // 4) Nested IF-ELSE
        if (age >= 18) {
            if (hasID) {
                System.out.println("NESTED IF: Entry allowed");
            } else {
                System.out.println("NESTED IF: ID required");
            }
        } else {
            System.out.println("NESTED IF: Underage");
        }

        // 5) Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("TERNARY: Max = " + max);

        // 6) Switch Statement
        switch (day) {
            case 1:
                System.out.println("SWITCH: Monday");
                break;
            case 2:
                System.out.println("SWITCH: Tuesday");
                break;
            case 3:
                System.out.println("SWITCH: Wednesday");
                break;
            default:
                System.out.println("SWITCH: Invalid day");
        }
    }
}