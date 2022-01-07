package tester;

import java.util.List;
import java.util.Scanner;

import com.app.sms.Student;
import com.app.sms.Subjects;

import static utils.CollectionUtils.*;
import static utils.ValidationRules.*;

public class StudentManagementApp {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			List<Student> list = populateStudentList();
			boolean exit = false;
			while(!exit) {
				try {
					System.out.println("");
					System.out.println("***************************************************");
					System.out.println("Choose an Option: ");
					System.out.println("1) Display All students by the specified course name");
					System.out.println("2) Update Student details (update marks & phone number");
					System.out.println("3) Cancel Student admission.");
					System.out.println("4) Display All Student's data");
					System.out.println("20) Exit");
					System.out.println("***************************************************");
					
					switch(sc.nextInt()) {
					
					case 1:
						/* 1. Display All students by the specified course name */
						
						System.out.println("Enter course name: ");
						String subject = sc.next();
						Subjects subj=subjectValidate(subject);
						System.out.println("The students with course name "+ subj + " are: ");
						list.stream().filter(s -> s.getSubject().equals(subj)).forEach(System.out::println);	
						break;
						
					case 2:
						/* 2. Update Student details (update marks & phone number) */
						System.out.println("Enter Student id , new marks, new phone number :");
						Student student = searchStudentByID(sc.nextInt(), list);  // method defined in ValidationRules;
						student.setMarks(sc.nextDouble());
						String phonenumber= sc.next();
						phoneNumValidate(phonenumber);
						student.setPhone_no(phonenumber);
						System.out.println("Updation of details successfull!!");
						break;
						
					case 3:
						/* 3. Cancel Student admission. */
						
						System.out.println("Enter the Email ID of student : ");
						String email = sc.next();
						emailValidate(email);
						searchStudentByEmailAndRemove(email, list);				
						break;
						
					case 4:
						/* 4) Display All Student's data */
						list.stream().forEach(System.out::println);		
						break;
						
					case 20:
						exit = true;
						System.out.println("Exiting...Good Bye...");
						break;

					default:
						System.out.println("Invalid choice!!");
					}
					
					
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				sc.nextLine();
			}
		}

	}

}
