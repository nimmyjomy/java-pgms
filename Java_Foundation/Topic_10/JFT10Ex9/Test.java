public class Test{
	public static void main(String[] args){
		Smartphone s1 = new Smartphone();
		s1.name = "Nooks 610";
		s1.manufacturer = "Nooks";
		s1.price = 100.00f;
		s1.releaseDate = "04/06/2008";
		s1.creditRemaining = 0.00f;
		s1.isFullyCharged = false;//s1 instance
		
		Smartphone.noSmartphone++;
		
		Smartphone s2 = new Smartphone();
		s2.name = "H3 Ssensation";
		s2.manufacturer = "H3C";
		s2.price = 110.00f;
		s2.releaseDate = "14/06/2012";
		s2.creditRemaining = 0.00f;
		s2.isFullyCharged = false;//s2 instance
		
		Smartphone.noSmartphone++;
		
		Smartphone s3 = new Smartphone();
		s3.name = "Simsung Desire";
		s3.manufacturer = "Simsung";
		s3.price = 190.00f;
		s3.releaseDate = "14/07/2014";
		s3.creditRemaining = 0.00f;
		s3.isFullyCharged = false;//s3 instance
		
		Smartphone.noSmartphone++;
		
		s1.topUpCredit(15.00f);
		s1.charge();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		Smartphone.getNoSmartphone();
		}
	}
		
		
		
		
		