public class JFT4Ex2{

   public static void main (String args[]){
   
   float priceAmount = 14.5F;
   
   float vatAmount;
   float totalPrice;
   
   vatAmount = 14.5f * 0.23f;
   totalPrice = priceAmount + vatAmount;
   System.out.println("Purchase Amount:" + priceAmount);
   System.out.println("VAT payable:" + vatAmount);
   System.out.println("Price:" + totalPrice);}
   
 }