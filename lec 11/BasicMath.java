public class BasicMath{

    //1. print all numbers
    public static void PrintNumbers(int num){
        if(num ==0)  return;
        while (num > 0){
            int getLast  =  num %10;
            System.out.println(getLast);
            num = num /10;
        }

    }

    //2. Count all digits
    public static void CountDigits(int num){
        if(num ==0)  return;
        int count =0;
        while (num > 0){
            int getLast  =  num %10;
            count++;
            num = num /10;
        }
        System.out.println("The count is : "+count);

    }

    //3. Sum of digits
    public static void SumOfDigits(int num){
        if (num == 0) return;
        int sum =0;
        while(num > 0){
            int getlast =num %10;
            sum += getlast;
            num /= 10;
        }
        System.out.println("sum of the digits: "+sum);
    }
    //4. reverse a numbers 
    public static void ReverseNumbers(int num){
        if (num == 0) return;
        int ans =0;
        while(num > 0){
            int getlast =num %10;
            ans *=10;
            ans += getlast;  // ans  =  ans *10 + getlast
            num /= 10;
        }
        System.out.println("Reverse of the digits: "+ans);
    }


    //5. Palindrome
    public static void Palindrome (int num){
            int ori = num;
        if (num == 0) return;
        int ans =0;
        while(num > 0){
            int getlast =num %10;
            ans *=10;
            ans += getlast;  // ans  =  ans *10 + getlast
            num /= 10;
        }
        if(ans == ori){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }

    //6. check Prime
    public static boolean CheckPrime(int num){
        if (num == 0 || num == 1) {
            return false;
    }

        // for(int i=2 ;i<num;i++){
        for(int i=2 ;i<=Math.sqrt(num);i++){ //more faster 
            if(num % i ==0){
                return false;
            }
        }
        
return true;

    } 
    //7. GCD of a number 
    public static void GCD(int num1,int num2){
        while(num2 != 0){
            int temp= num2;
            num2 =  num1 % num2;
            num1 = temp;
        }
       System.out.println(num1);
    }
    //8. lcm of a number 
    public static void LCM(int num1,int num2){
        int a =num1;
        int b=num2;
        while(num2 != 0){
            int temp= num2;
            num2 =  num1 % num2;
            num1 = temp;
        }
        int gcd  = num1;
        int lcm  = (a*b) / gcd;
       System.out.println(lcm);
    }

    //9. armstrong number 
    public static void Armstrong(int num){
        int ori = num;
        int sum = 0;

        if(num == 0 ) return;
        while(num != 0){
            int getlast  = num % 10;
            sum += getlast * getlast *getlast;
            num /=10;
        }
        if(sum == ori){

            System.out.println("ARMSTRONG");

        }else{
            System.out.println("Not an armstrong");
        }
    }

    //10. perfect number or  find divisors
    public static void PerfectNumber(int num){
        int ori = num;
        int sum = 1;
        for(int i=2; i<Math.sqrt(num);i++){
            if(num % i ==0){
                int firstFactor=i;
                int secondFactor =num/i;
                sum += firstFactor+secondFactor;
            } 
        }
        System.out.println("the perfect number of 6 is " + sum);
        System.out.println((sum == ori) ? "Perfect number" : "Not Perfect number");
    }

    //11 . print all the primes 
    public static void printPrimes(int num){
        for(int i =2;i<=num; i++){
            if(CheckPrime(i)){
                System.out.print(i+" ");
            }
        }

    }


    public static void main(String args[]){
        //1 print numbers
        PrintNumbers(12345);

        //2 Count numbers
        CountDigits(12345);

        //3. sum of digits
        SumOfDigits(12345);

        //4. reverse of the numbers
        ReverseNumbers(12345);

        //5. Palindrome
        Palindrome(1221);

        //6.check prime
        CheckPrime(21);

        //7. gcd
        GCD(18,12);
        
        //8. LCM
        LCM(18, 12);

        // 9. Armstrong
        Armstrong(153);

        //10. perfect number
        PerfectNumber(6);
        //11. print all primes 
        printPrimes(10);
    } 
}