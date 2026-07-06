 /*
=========================================================
            BITWISE OPERATORS IN JAVA
=========================================================

Bitwise operators work on the binary representation of numbers.

Example:

10 = 00001010
 6 = 00000110

Operators:
&   -> AND
|   -> OR
^   -> XOR
~   -> NOT (Complement)
<<  -> Left Shift
>>  -> Right Shift (Signed)
>>> -> Unsigned Right Shift

=========================================================
*/

public class Main {

    public static void main(String[] args) {

        int a = 10;      // 00001010 
        int b = 6;       // 00000110

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // ==============================================
        // BITWISE AND (&)
        // ==============================================
        /*
            Rule:

            1 & 1 = 1
            1 & 0 = 0
            0 & 1 = 0
            0 & 0 = 0

            10 = 1010
             6 = 0110
            ----------
                 0010 = 2
        */

        System.out.println("\n========== BITWISE AND ==========");
        System.out.println("a & b = " + (a & b));



        // ==============================================
        // BITWISE OR (|)
        // ==============================================
        /*
            Rule:

            1 | 1 = 1
            1 | 0 = 1
            0 | 1 = 1
            0 | 0 = 0

            10 = 1010
             6 = 0110
            ----------
                 1110 = 14
        */

        System.out.println("\n========== BITWISE OR ==========");
        System.out.println("a | b = " + (a | b));



        // ==============================================
        // BITWISE XOR (^)
        // ==============================================
        /*
            Rule:

            1 ^ 1 = 0
            1 ^ 0 = 1
            0 ^ 1 = 1
            0 ^ 0 = 0

            XOR returns 1 only if bits are different.

            10 = 1010
             6 = 0110
            ----------
                 1100 = 12
        */

        System.out.println("\n========== BITWISE XOR ==========");
        System.out.println("a ^ b = " + (a ^ b));



        // ==============================================
        // BITWISE NOT (~)
        // ==============================================
        /*
            NOT flips every bit.

            Example:

            10

            Binary (32-bit):
            00000000 00000000 00000000 00001010

            After NOT:

            11111111 11111111 11111111 11110101

            Result = -11

            Formula:

            ~x = -(x + 1)

            Example:

            ~10 = -11
            ~20 = -21
            ~100 = -101
        */

        System.out.println("\n========== BITWISE NOT ==========");
        System.out.println("~a = " + (~a));



        // ==============================================
        // LEFT SHIFT (<<)
        // ==============================================
        /*
            Left Shift moves bits to the left.

            Every left shift multiplies the number by 2.

            Example:

            10 = 1010

            10 << 1

            1010 -> 10100

            Result = 20
        */

        System.out.println("\n========== LEFT SHIFT ==========");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a << 2 = " + (a << 2));



        // ==============================================
        // RIGHT SHIFT (>>)
        // ==============================================
        /*
            Right Shift moves bits to the right.

            Every right shift divides the number by 2.

            Example:

            10 = 1010

            10 >> 1

            1010 -> 0101

            Result = 5
        */

        System.out.println("\n========== RIGHT SHIFT ==========");
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >> 2 = " + (a >> 2));



        // ==============================================
        // UNSIGNED RIGHT SHIFT (>>>)
        // ==============================================
        /*
            >>> fills leftmost bits with 0.

            Mainly useful for negative numbers.
        */

        int negative = -10;

        System.out.println("\n========== UNSIGNED RIGHT SHIFT ==========");
        System.out.println("negative = " + negative);
        System.out.println("negative >>> 1 = " + (negative >>> 1));



        // ==============================================
        // CHECK IF NUMBER IS EVEN OR ODD
        // ==============================================
        /*
            Last bit determines odd/even.

            Even -> Last bit = 0

            Odd -> Last bit = 1

            Use:

            (n & 1)
        */

        int n = 25;

        System.out.println("\n========== EVEN / ODD ==========");

        if ((n & 1) == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");



        // ==============================================
        // CHECK IF K-th BIT IS SET
        // ==============================================
        /*
            Formula:

            (number & (1 << k)) != 0

            k starts from 0.
        */

        int number = 10;      // 1010
        int k = 3;

        System.out.println("\n========== CHECK K-th BIT ==========");

        if ((number & (1 << k)) != 0)
            System.out.println("Bit is SET");
        else
            System.out.println("Bit is NOT SET");



        // ==============================================
        // SET THE K-th BIT
        // ==============================================
        /*
            Formula:

            number | (1 << k)
        */

        number = 10;

        int setBit = number | (1 << 0);

        System.out.println("\n========== SET BIT ==========");
        System.out.println("Original = " + number);
        System.out.println("After Setting = " + setBit);



        // ==============================================
        // CLEAR THE K-th BIT
        // ==============================================
        /*
            Formula:

            number & ~(1 << k)
        */

        number = 10;
        int xk=1;

        int clearBit = number & ~(1 << xk);

        System.out.println("\n========== CLEAR BIT ==========");
        System.out.println("Original = " + number);
        System.out.println("After Clearing = " + clearBit);



        // ==============================================
        // TOGGLE THE K-th BIT
        // ==============================================
        /*
            Formula:

            number ^ (1 << k)
        */

        number = 10;

        int toggle = number ^ (1 << 2);

        System.out.println("\n========== TOGGLE BIT ==========");
        System.out.println("Original = " + number);
        System.out.println("After Toggle = " + toggle);



        // ==============================================
        // COUNT NUMBER OF SET BITS
        // ==============================================
        /*
            Keep checking the last bit and shift right.
        */

        number = 29;   //11101

        int count = 0;
        int temp = number;

        while (temp > 0) {

            count += (temp & 1);

            temp >>= 1;
        }

        System.out.println("\n========== COUNT SET BITS ==========");
        System.out.println(number + " has " + count + " set bits.");



        // ==============================================
        // SWAP TWO NUMBERS USING XOR
        // ==============================================
        /*
            No third variable needed.
        */

        int x = 5;
        int y = 9;

        System.out.println("\n========== XOR SWAP ==========");
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("\nAfter Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);



        // ==============================================
        // POWER OF TWO
        // ==============================================
        /*
            A power of two has exactly one set bit.

            Formula:

            n > 0 && (n & (n-1)) == 0
        */

        number = 64;

        System.out.println("\n========== POWER OF TWO ==========");

        if (number > 0 && (number & (number - 1)) == 0)
            System.out.println(number + " is Power of Two");
        else
            System.out.println(number + " is NOT Power of Two");



        // ==============================================
        // MULTIPLY BY 2
        // ==============================================

        System.out.println("\n========== MULTIPLY BY 2 ==========");
        System.out.println("15 << 1 = " + (15 << 1));



        // ==============================================
        // DIVIDE BY 2
        // ==============================================

        System.out.println("\n========== DIVIDE BY 2 ==========");
        System.out.println("15 >> 1 = " + (15 >> 1));



        // ==============================================
        // BUILT-IN BIT FUNCTIONS
        // ==============================================

        System.out.println("\n========== INTEGER CLASS ==========");

        System.out.println("Binary of 10 : " +
                Integer.toBinaryString(10));

        System.out.println("Bit Count of 29 : " +
                Integer.bitCount(29));

        System.out.println("Highest One Bit of 29 : " +
                Integer.highestOneBit(29));

        System.out.println("Lowest One Bit of 29 : " +
                Integer.lowestOneBit(29));

    }
}