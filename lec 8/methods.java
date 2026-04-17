public class methods {
    
    //method 1  or function 1 
    static void table(int a){
        for (int i=1 ;i<=10 ;i++){
           
            System.out.println(a +"* " + i+ "=" + i*a);
        }
    }

  public static void main(String args[]){
    System.out.println("declared below and used the method");
    table(2);
  }


}
