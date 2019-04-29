public class Teacher {

	private String fName, lName, subject;
	
	//Initializes First, Last name, Grade, and Student ID if the class was created without one.
	Teacher() {
		fName   = "NO FIRST NAME x0";
		lName   = "NO LAST NAME x0";
		subject = "NO SUBJECT x0";
	}

	//copies the given values into the initialized variables.
	Teacher(String fName, String lName, String subject) {
		
		this.fName   = fName;
		this.lName   = lName;
		this.subject = subject;
		
	}

	//returns Subject.
	public String getSubject() {
		return subject;
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
