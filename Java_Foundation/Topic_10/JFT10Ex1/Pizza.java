public class Pizza{

	public String size;
	public String toppings;
	public double diameter;
	public int price;
	
	public String eat(){
		return "Eat a pizza slowly";
		}//method eat
		
	public String toString(){
		return "Size:"+size+"\n"+"Toppings"+toppings+"\n"+"Diameter:"+diameter;
		}
	}//class pizza