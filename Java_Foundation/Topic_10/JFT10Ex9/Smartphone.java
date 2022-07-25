public class Smartphone{
	public String name;
	public String manufacturer;
	public float price;
	public String releaseDate;
	public float creditRemaining;
	public boolean isFullyCharged;
	
	public static int noSmartphone;
	
	public static void getNoSmartphone(){
		System.out.println(noSmartphone+"have been created");
	}
	
	public void makeCall(String noToCall){
		System.out.println("Dialing no:"+noToCall);
		}
		
	public void topUpCredit(float topUpAmount){
	
		creditRemaining += topUpAmount;
		System.out.println("You have successfully topped up.Your new balance is:"+creditRemaining);
		}
	public void charge(){
	
		isFullyCharged = true;
		System.out.println("The samrtphone is fully charged");
		}
	public String toString(){
		return "Name: " + name + "\n" + "Manufacturer: " + manufacturer + "\n" + "Price: " + price + "\n" +
	      "Release Date: " + releaseDate + "\n" + "Credit: " + creditRemaining + "\n" + "charge status: " + isFullyCharged;
		  }
	}