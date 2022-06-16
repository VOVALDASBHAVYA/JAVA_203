package constructor;

public class Student {

	
		// TODO Auto-generated method stub
		//instance variables
		public int studentId;
		public String studentName;
		public String courseName;
		public int marks;
		//default constructor
		public Student() {
			System.out.println("Default constructor");
		}
		public Student(int studentId, String studentName,String courseName,int marks) {
			this();//default instance or current instance
			this.marks=marks;//representing instance variable or obj.
			this.studentId=studentId;
			this.studentName=studentName;
			this.courseName=courseName;
			
		}
		public String grade() {
			String result=" ";
			if(marks>=90) {
				result="A grade";
			}else {
				result="B grade";
			}return result;
		}
		public Student(Student s1,String grade) 
		{//copy constructor as we don't have it java(in java it can be treated as parameterised constructor only)
			//but it is there in .NET
			this.studentId=s1.studentId;
			this.studentName=s1.studentName;
			this.courseName=s1.courseName;
			//this.grade()=grade;
		}
		public static void main(String[] args) {
			Student s1=new Student(100,"abc","java",90);
			System.out.println("studentId: "+s1.studentId);
			System.out.println("studentgrade: "+s1.grade());
			System.out.println("studentName: "+s1.studentName);
	}

}
