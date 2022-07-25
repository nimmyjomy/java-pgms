public class JFT8Ex11{
	public static void main(String[] args){
		char[] response = new char[10];
		response[0] = 'Y';
		response[1] = 'Y';
		response[2] = 'Y';
		response[3] = 'Y';
		response[4] = 'Y';
		response[5] = 'Y';
		response[6] = 'N';
		response[7] = 'Y';
		response[8] = 'N';
		response[9] = 'N';
		int res = 0;
		for(int i=0;i<10;i++){
			if (response[i]=='Y'){
				res++;
				}
			if(res==7)
			break;
			}
		if(res>=7){
		System.out.println("go for shipping");
		}
	}
}
	
		
			 
		
			
	
	