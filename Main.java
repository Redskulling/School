public class Main {
    public static void main(String[] args) {
    	School school = new School();
    	
    	//Adds students to the school.  First name, Last name, grade.
    	school.addStudent("Barbra",    "Fern",    9);
    	school.addStudent("Charlotte", "Kate",    9);
    	school.addStudent("Holly",     "Smith",   9);
    	
    	school.addStudent("John",      "Willans", 10);
    	school.addStudent("Thomas",    "Edward",  10);
    	school.addStudent("Jhon",      "Smith",   10);
    	
    	school.addStudent("Mike",      "Baker",   11);
    	school.addStudent("Emily",     "Hannah",  11);
    	
    	school.addStudent("Jessica",   "Oliva",   12);
    	school.addStudent("Lewis",     "Hojan",   12);
    	
    	//Adds Teachers to the school.  First name, Last name, Subject.
    	school.addTeacher("Michael", "Moores",  "Science");
    	school.addTeacher("Paul",    "Johnson", "Math");
    	school.addTeacher("Barbra",  "Wilson",  "English");
    	
    	//Prints all the students.
    	for (int i = 0; i < school.students.size(); i++) {
    		school.printStudent(i);
    	}
    	
    	System.out.println("--Teachers--\n");
    	//Prints all the students.
    	for (int i = 0; i < school.teachers.size(); i++) {
    		school.printTeacher(i);
    	}
    	
    	//Removes students index 5 and 2.
    	school.removeStudent(5);
    	school.removeStudent(2);
    	
    	//Removes Teacher index 1.
    	school.removeTeacher(1);
    	
    	//Prints all the students.
    	System.out.println("--Removed--\n");
    	for (int i = 0; i < school.students.size(); i++) {
    		school.printStudent(i);
    	}
    	
    	//Prints all the students.
    	System.out.println("--Teachers--\n");
    	for (int i = 0; i < school.teachers.size(); i++) {
    		school.printTeacher(i);
    	}
    } 	
}
