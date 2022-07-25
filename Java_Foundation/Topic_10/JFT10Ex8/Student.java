public class Student{
	public String firstName;
	public String lastName;
	public byte age;
	public String className;
	public float gradeAverage;
	public String address;
	
	public String toString(){
	 return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" +
	"Class Name: " + className + "\n" + "Grade Average: " + gradeAverage + "\n" + "Address: " + address;
  }// method
  
  public static int noStudents;
  public static float averageGrade;
  
  public static float studentGrade(){
	return averageGrade/noStudents;
	}
}