package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.sms.Student;
import com.app.sms.Subjects;

public interface CollectionUtils {
	
	static List<Student> populateStudentList(){
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1234,"Kamal","9450916593",Subjects.ANGULAR,85,"kamal@gmail.com"));
		students.add(new Student(45646,"Manish","7450916222",Subjects.JAVA,95,"manish@gmail.com"));
		students.add(new Student(78714,"Avnish","6250916396",Subjects.SE,75,"avnish@gmail.com"));
		students.add(new Student(57774,"Mohan","6350916454",Subjects.DBT,93,"mohan@gmail.com"));
		students.add(new Student(89546,"Rohan","8850916777",Subjects.ANGULAR,68,"rohan@gmail.com"));
		students.add(new Student(45698,"Akash","7550916536",Subjects.REACT,76,"akash@gmail.com"));
		students.add(new Student(78564,"Anu","9489916864",Subjects.JAVA,87,"anu@gmail.com"));
		students.add(new Student(86926,"Ritik","9550913521",Subjects.PYTHON,59,"ritik@gmail.com"));
		
		return students;
	}

}
