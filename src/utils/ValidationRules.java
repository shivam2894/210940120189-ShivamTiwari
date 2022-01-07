package utils;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.app.sms.Student;
import com.app.sms.Subjects;

import custom_exception.StudentHandlingException;

public class ValidationRules {
	
	public static void phoneNumValidate(String phoneNo) throws StudentHandlingException
	{
		
		if(phoneNo.length() != 10) throw new StudentHandlingException("Phone Number must contain 10 digits!!");	
	}
	
	public static Subjects subjectValidate( String subject) throws StudentHandlingException {
		
		Subjects sub ;
		try {
			sub = Subjects.valueOf(subject.toUpperCase());
			return sub;
		}catch(IllegalArgumentException e) {
			throw new StudentHandlingException("Please enter a valid subject from the list:" + Arrays.toString(Subjects.values()));
		}
	}
	
	public static void emailValidate(String email) throws StudentHandlingException {
		if(!email.matches("\\w+@[a-z]+\\.com$")) throw new StudentHandlingException("Email ID should be in proper format like abc@xyz.com");
		
	}
	
	public static void checkDuplicateEntry(int id, List<Student> students) throws StudentHandlingException
	{
		Student s1 = new Student(id);
		if(students.contains(s1)) throw new StudentHandlingException("Duplicate entry found!!");
	}
	
	public static Student searchStudentByID(int id, List<Student> students) throws StudentHandlingException
	{
		Student stu = new Student(id);
		int index = students.indexOf(stu);
		if(index==-1) throw new StudentHandlingException("Student with id "+id+" not found");
		return students.get(index);
		
	}
	
	public static void searchStudentByEmailAndRemove(String email, List<Student> students) throws StudentHandlingException {
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext())
		{
			Student s =itr.next();
			if((s.getEmail()).equals(email))
			{
				itr.remove();
				System.out.println("Student with email Id "+email+" found. Name: "+s.getName() + " Admission Cancelled!!");
				return;
			}
		}
		throw new StudentHandlingException("Student with email "+ email + " not found!!");
	}
	
	public static Student validateAll(int id,String name,String phone_no, String subject, double marks, String email) throws StudentHandlingException
	{
		
		phoneNumValidate(phone_no);
		Subjects subj =subjectValidate(subject);
		emailValidate(email);
		
		return new Student(id,name,phone_no,subj,marks,email);
		
	}
	
	
	
	

}
