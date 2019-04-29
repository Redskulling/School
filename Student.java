public class Student {
	
	private String fName, lName;
	private int grade, sid;
	
	//Initializes First, Last name, Grade, and Student ID if the class was created without one.
	Student() {
		fName   = "NO FIRST NAME x0";
		lName   = "NO LAST NAME x0";
		grade = -1;
		sid = -1;
	}
	
	//copies the given values into the initialized variables.
	Student(String fName, String lName, int grade, int sid) {
		
		this.fName   = fName;
		this.lName   = lName;
		this.grade   = grade;
		this.sid     = sid;
		
	}

	//returns grade.
	public int getGrade() {
		return grade;
	}
	
	//returns Student ID.
	public int getSid() {
		return sid;
	}
	
	//returns First name.
	public String getfName() {
		return fName;
	}
	
	//returns Last name.
	public String getlName() {
		return lName;
	}
	
}
