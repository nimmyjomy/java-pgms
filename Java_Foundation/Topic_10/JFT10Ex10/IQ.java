public class IQ{

	private String name;
	private int age;
	private float iQScore;
	
	public String getName(){
		return name;
		}
	public void setName(String name){
		this.name = name;
		}
		
	public void setAge(int age){
		if(age>=1 && age<=115){
			this.age = age;
			}
		else{
			this.age = 0;
		}
	}
	public int getAge(){
		return age;
		}
		
	public void setIQ(float iQScore){
		if(iQScore>=1 && iQScore<=200){
			this.iQScore = iQScore;
			}
		else{
			this.iQScore = 0;
		}
		}
	public float getIQ(){
		return iQScore;
		}
	public String IQReport(){
		if(iQScore<100){
			return "Below Average";
			}
		else if(iQScore>=100&&iQScore<=150){
			return "Above average";
			}
		else{
		return "Exceptional";
		}
	}
		
	public String toString(){
		return "Name:"+name+"\n"+"Age:"+age+"\n"+"IQ Score"+iQScore+"\n";
		}
	}
		
	
	
