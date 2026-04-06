public class AllLoopsDemo {
    public static void main(String[] args) {

        // 1️⃣ FOR LOOP
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2️⃣ NESTED LOOP
        System.out.println("\nNESTED LOOP (Pattern):");
        for (int i = 1; i <= 3; i++) {          // outer loop
            for (int j = 1; j <= 3; j++) {      // inner loop
                System.out.print("* ");
            }
            System.out.println();               // new line after each row
        }

        // 3️⃣ WHILE LOOP
        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 4️⃣ DO-WHILE LOOP
        System.out.println("\nDO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}