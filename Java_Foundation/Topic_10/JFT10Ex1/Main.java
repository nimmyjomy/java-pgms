	
public class Main{
	public static void main(String[] args){
		Pizza p1 = new Pizza();
		
		p1.size = "Small";
		p1.toppings = "Ham and pineapple";
		p1.diameter = 12.00;
		p1.price = 10;
		p1.eat();
		System.out.println(p1.toString());
		
		Pizza p2 = new Pizza();
		p2.size = "Medium";
		p2.toppings = "Chicken and mushroom";
		p2.diameter = 14.00;
		p2.price = 12;
		System.out.println(p2.eat());
		System.out.println(p2.toString());
		}
	}