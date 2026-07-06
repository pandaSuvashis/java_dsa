import java.util.Scanner;
import java.util.*;

public class Even{
    public static void main(String args[]){
        System.out.println("Even using Bit wise operator");
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();

        if((x & 1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

        
    }
}
