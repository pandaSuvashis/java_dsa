public class Pract {

    public static void main(String[] args) {

        // Primitive Data Types

        byte a = 127;                  // 1 byte
        short b = 32000;               // 2 bytes
        int c = 20;                    // 4 bytes
        long d = 9876543210L;          // 8 bytes

        float e = 0.31f;               // 4 bytes
        double f = 2.111212121;        // 8 bytes

        char g = 'A';                  // 2 bytes (Unicode)

        boolean h = true;              // true or false

        // Non-Primitive Data Types

        String i = "Panda";

        // Wrapper Classes

        Byte j = 127;
        Short k = 32000;
        Integer l = 21;
        Long m = 9876543210L;

        Float n = 3.14f;
        Double o = 99.999;

        Character p = 'Z';

        Boolean q = false;

        // Printing all values

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);

        System.out.println("float: " + e);
        System.out.println("double: " + f);

        System.out.println("char: " + g);
        System.out.println("boolean: " + h);

        System.out.println("String: " + i);

        System.out.println("Byte: " + j);
        System.out.println("Short: " + k);
        System.out.println("Integer: " + l);
        System.out.println("Long: " + m);

        System.out.println("Float: " + n);
        System.out.println("Double: " + o);

        System.out.println("Character: " + p);
        System.out.println("Boolean: " + q);

System.out.println();
System.out.println();
//try catch
         try {

            int a1 = 10;
            int b1 = 0;

            System.out.println(a1 / b1);

        } catch (ArithmeticException ex) {

            ex.printStackTrace();

        }
    }
}