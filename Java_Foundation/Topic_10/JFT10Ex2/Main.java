public class Main{
	public static void main(String[] args){
		
		Jelly j1 = new Jelly();
		j1.manufacturer = "Chivery";
		j1.price = 3.50f;
		j1.flavour = "Stawberry";
		
		System.out.println(j1.setInstructions());
		System.out.println(j1.toString());
		
		Jelly j2 = new Jelly();
		j2.manufacturer = "Nestle";
		j2.price = 33.54f;
		j2.flavour = "Lemon";
		
		System.out.println(j2.setInstructions());
		System.out.println(j2.toString());
		}
	}