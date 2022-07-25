public class JFT4Ex5{   
   
   public static void main(String[] args) {
   
   double initial = 1000.0;
   double interestRate = 0.05;
   double interest = initial * interestRate;
   double total = initial + interest;
   
   System.out.println("Principal is :  " +initial + " euro.");
   System.out.println("The rate of interest is : " +interestRate + ".");
   System.out.println("Interest earned is "+interest);
   System.out.println("Value of the investment is : " +total + " euro.");
   
   }
 }
   