public class JFT6Ex4{   
   
   public static void main(String[] args) {
   
    int withAmount = 20;
	int balance = 180;
	if (balance >100){
	System.out.println("Withdrawal processed:" + withAmount);
	System.out.println("New balance:  " + (balance-withAmount));
	}
	else{
	System.out.println("You can't withdraw");
	}
	}
	}