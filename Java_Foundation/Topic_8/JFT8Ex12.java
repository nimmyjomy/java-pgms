public class JFT8Ex12{
	public static void main(String[] args){
		int[] ages = {34,16,31,19,30,19,32,11,12,13};
		String[] names = {"John","Frank","Anna","Jennifer","Francis","Fred","Phillipa","Jason.","Ian","Derva"};
		for(int i=0;i<ages.length;i++){
			if(ages[i]<18)
				continue;
			System.out.println(names[i]+"-you are eligible to vote");
			
		}
	}
}