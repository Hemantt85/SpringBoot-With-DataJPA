package in.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.services.StudentServices;
import in.sp.main.entities.Student;
import in.sp.main.services.StudentServiceImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithDataJpaApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(SpringBootWithDataJpaApplication.class, args);
		StudentServices stdservices=context.getBean(StudentServiceImpl.class);
		
		Student std=new Student();
		std.setName("Rohit");
		std.setRollno(101);
		std.setMarks(85.5f);
		
		
		
		//--insertion--
//		boolean status=stdservices.addStudentDetails(std);
//		if(status) {
//			System.out.println("Student details added successfully");
//		}
//		else {
//			System.out.println("Failed to add student details");
//		}

		
		
		
//		//--Select operation1--
//		List<Student> list=stdservices.getAllStudentDetails();
//		for(Student s:list) {
//			System.out.println("Id: "+s.getId());
//			System.out.println("Name: "+s.getName());
//			System.out.println("Rollno: "+s.getRollno());
//			System.out.println("Marks: "+s.getMarks());
//			System.out.println("-----------------------------");
//		}
		
		
		
		
		//--Select operation2--
		Student s=stdservices.getStudentDetailsById(1L);
		if(s!=null) {
			System.out.println("Id: "+s.getId());
			System.out.println("Name: "+s.getName());
			System.out.println("Rollno: "+s.getRollno());
			System.out.println("Marks: "+s.getMarks());
			System.out.println("-----------------------------");
		}
		else {
			System.out.println("Student details not found for the given id");
	}
		
		
		
		
//		//--update operation--
//		boolean status=stdservices.updateStudentDetails(1L, 90.0f);
//		if(status) {
//			System.out.println("Student details updated successfully");
//		}
//		else {
//			System.out.println("Failed to update student details");
//		}	
		
		
		//--delete operation--
		
		boolean status=stdservices.deleteStudentDetailsById(1L);
		if(status) {
			System.out.println("Student details deleted successfully");
		}
		else {
			System.out.println("Failed to delete student details");
		}
	}
	
}
