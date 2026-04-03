// In this file we will learn how to take input in Java
import java.math.BigInteger; //Biginteger is not primitive Datatype
import java.util.Scanner;

public class IO{
    public static void main(String args[]){

      
        System.out.print("Enter ph: ");
        Scanner sc =  new Scanner(System.in);//making an object of scannner class to use it's features of input and output of user

        BigInteger ph = sc.nextBigInteger(); //taking input for a bigIntegr variable 
        System.out.println(ph);
        
// taking input of an array
int n =5;
int arr[] =new int[n]; //for array we need to allocate memory;
System.out.println("enter the elements of array : ");
for (int i =0; i<arr.length ; i++){
   arr[i]= sc.nextInt();
}
for (int i=0 ; i<arr.length;i++){
    System.out.println(arr[i]);
}



        sc.close();  //closing the sc object 
    }
}