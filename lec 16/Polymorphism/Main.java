
public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(2,2));

        System.out.println(calc.add(2,2,3));

        System.out.println(calc.add(2,2,3,8.0));
    }
}