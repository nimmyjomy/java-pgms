public class JFT8Ex10{
	public static void main(String[] args){
		String[] passwords = new String[4];
		passwords[0]="oxymoran";
		passwords[1]="poxedfox";
		passwords[2]="kingfisher";
		passwords[3]="cruiseshipper";
		String lookFor="cruiseshipper";
		boolean foundPassword = false;
		for(String password : passwords){
			if (password.equals(lookFor)){
				System.out.println("Log-on Successful");
				foundPassword = true;
				break;
				}
			
				
		}
		if(!foundPassword)
			System.out.println("You cannot logged on using specified password");
		}
	}
		