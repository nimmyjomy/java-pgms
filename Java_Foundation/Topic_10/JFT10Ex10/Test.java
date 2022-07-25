public class Test{
	public static void main(String[] args){
		IQ i1 = new IQ();
		i1.setName("James Devine");
		i1.setAge(46);
		i1.setIQ(87);
		
		IQ i2 = new IQ();
		i2.setName("Helena Smith");
		i2.setAge(126);
		i2.setIQ(101);
		
		IQ i3 = new IQ();
		i3.setName("Daniel Jones");
		i3.setAge(27);
		i3.setIQ(1510);
		
		System.out.println(i1.IQReport());
		System.out.println(i1.toString());
		
		System.out.println(i2.IQReport());
		System.out.println(i2.toString());
		
		System.out.println(i3.IQReport());
		System.out.println(i3.toString());
	}
	}
		
		