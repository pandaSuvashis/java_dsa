public class pattern {
   public static void main(String[] args) {
        int n = 5;

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
    }

    // 1. Square
    static void pattern1(int n) {
        System.out.println("Pattern 1");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 2. Right triangle
    static void pattern2(int n) {
        System.out.println("Pattern 2");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 3. Inverted triangle
    static void pattern3(int n) {
        System.out.println("Pattern 3");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 4. Number triangle
    static void pattern4(int n) {
        System.out.println("Pattern 4");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }

    // 5. Same number triangle
    static void pattern5(int n) {
        System.out.println("Pattern 5");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(i+" ");
            System.out.println();
        }
    }

    // 6. Pyramid
    static void pattern6(int n) {
        System.out.println("Pattern 6");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }

    // 7. Inverted pyramid
    static void pattern7(int n) {
        System.out.println("Pattern 7");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }

    // 8. Diamond
    static void pattern8(int n) {
        System.out.println("Pattern 8");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }

    // 9. Floyd's triangle
    static void pattern9(int n) {
        System.out.println("Pattern 9");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    // 10. Binary triangle
    static void pattern10(int n) {
        System.out.println("Pattern 10");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i+j)%2 + " ");
            }
            System.out.println();
        }
    }

    // 11. Hollow square
    static void pattern11(int n) {
        System.out.println("Pattern 11");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 12. Hollow triangle
    static void pattern12(int n) {
        System.out.println("Pattern 12");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n||j==1||j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 13. Right aligned triangle
    static void pattern13(int n) {
        System.out.println("Pattern 13");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }

    // 14. Number pyramid
    static void pattern14(int n) {
        System.out.println("Pattern 14");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print(i+" ");
            System.out.println();
        }
    }

    // 15. Reverse number triangle
    static void pattern15(int n) {
        System.out.println("Pattern 15");
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--) System.out.print(j+" ");
            System.out.println();
        }
    }

    // 16. Palindrome pyramid
    static void pattern16(int n) {
        System.out.println("Pattern 16");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=i;j>=1;j--) System.out.print(j);
            for(int j=2;j<=i;j++) System.out.print(j);
            System.out.println();
        }
    }

    // 17. Star + number mix
    static void pattern17(int n) {
        System.out.println("Pattern 17");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0) System.out.print("* ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // 18. Cross pattern
    static void pattern18(int n) {
        System.out.println("Pattern 18");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 19. Box with diagonals
    static void pattern19(int n) {
        System.out.println("Pattern 19");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 20. Zigzag pattern
    static void pattern20(int n) {
        System.out.println("Pattern 20");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%4==0 || (i==2 && j%4==0))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
