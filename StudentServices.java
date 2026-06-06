package in.sp.main.services;

import java.util.List;

import in.sp.main.entities.Student;

public interface StudentServices 
{
	//public boolean addStudentDetails(Student std);
	//public List<Student> getAllStudentDetails();
	public Student getStudentDetailsById(Long id);
	
	//public boolean updateStudentDetails(Long id,float marks);
	
	public boolean deleteStudentDetailsById(Long id);
}

