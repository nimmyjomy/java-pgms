public class Test{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.firstName = "Billy";
		s1.lastName = "Davis";
		s1.age = 17;
		s1.className = "Leaving Cert1";
		s1.gradeAverage = 70.50f;
		s1.address = "12 High Street,Dublin";
		
		System.out.println(s1.toString());
		
		Student.noStudents++;
		Student.averageGrade+=s1.gradeAverage;//s1 instance
		
		Student s2 = new Student();
		s2.firstName = "Anna";
		s2.lastName = "Davis";
		s2.age = 18;
		s2.className = "Leaving Cert1";
		s2.gradeAverage = 80.00f;
		s2.address = "19 Lower Street,Dublin";
		
		System.out.println(s2.toString());
		
		Student.noStudents++;
		Student.averageGrade+=s2.gradeAverage;//s2 instance
		
		Student s3 = new Student();
		s3.firstName = "Georgina";
		s3.lastName = "Moraity";
		s3.age = 17;
		s3.className = "Leaving Cert1";
		s3.gradeAverage = 90.00f;
		s3.address = "5 Middle Street,Dublin";
		
		System.out.println(s3.toString());
		
		Student.noStudents++;
		Student.averageGrade+=s3.gradeAverage;
		
		System.out.println("NO:of students"+Student.noStudents);
		System.out.println("Average:"+(Student.studentGrade()));
		}
	}
		
		