import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    
    //Adds a teacher with a First name, Last name, and Subject.
	void addTeacher(String fName, String lName, String subject) {
		teachers.add(new Teacher(fName, lName, subject));
	}
	
	//prints a teacher with a specified index
	void printTeacher(int index) {
		if (index >= teachers.size() || index < 0)
			index = teachers.size() - 1;
		String lName   = teachers.get(index).getlName();
		String fName   = teachers.get(index).getfName();
		String subject = teachers.get(index).getSubject();
		
		System.out.println("Index: " + index + 
		                   "\nName: " + lName + ", " + fName +
		                   "\nSubject: " + subject + "\n");
		
	}
	
	//Prints a teacher with index 0.
	void printTeacher() {
		printTeacher(0);
	}
	
	//Removes a teacher with a specified index.
	void removeTeacher(int index) {
		if (index >= teachers.size() || index < 0)
			index = teachers.size() - 1;
		teachers.remove(index);
	}
	
	//removes a teacher with index 0.
	void removeTeacher() {
		removeTeacher(0);
	}
	
    //Adds a student with a First name, Last name, and Grade.
	void addStudent(String fName, String lName, int grade) {
		students.add(new Student(fName, lName, grade, students.size()));
	}
	
	//Prints a student with a specified index.
	void printStudent(int index) {
		if (index >= students.size() || index < 0)
			index = students.size() - 1;

		String lName = students.get(index).getlName();
		String fName = students.get(index).getfName();
		int grade    = students.get(index).getGrade();
		int sid      = students.get(index).getSid();
	
		System.out.println("Index: "  + index + 
		                   "\nName: " + lName + ", " + fName +
		                   "\nGrade " + grade +
		                   "\nStudent ID: " + sid + "\n");
		
	}
	
	//prints a student with index 0.
	void printStudent() {
		printStudent(0);
	}
	
	//Removes a students with a specified index.
	void removeStudent(int index) {
		if (index >= students.size() || index < 0)
			index = students.size() - 1;
		students.remove(index);
	}
	
	//Removes a students with index 0.
	void removeStudent() {
		removeStudent(0);
	}

	ArrayList<Teacher> teacher() {		
		
		return teachers;
		
	};
	
	ArrayList<Student> student() {
		
		return students;
		
	};
	


}
