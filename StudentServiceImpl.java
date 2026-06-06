package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.Student;
import in.sp.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServices
{
	@Autowired
	private StudentRepository studentRepository;

	
	
	
	
//	@Override
//	public boolean addStudentDetails(Student std) 
//	{
//		boolean status = false;
//		try
//		{
//			studentRepository.save(std);
//			status = true;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return status;
//	}

	
	
//	
//	@Override
//	public List<Student> getAllStudentDetails() {
//		
//		return studentRepository.findAll();
//	}

	
	
	
	
	@Override
	public Student getStudentDetailsById(Long id) {
		
		Optional<Student> optional=studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
	}
	
	
	
//	@Override
//	public boolean updateStudentDetails(Long id, float marks)
//	{
//		Student std=getStudentDetailsById(id);
//		if(std!=null) {
//			std.setMarks(marks);
//			studentRepository.save(std);
//			return true;
//		}
//		else {
//			return false;
//		}
	
	@Override
	public boolean deleteStudentDetailsById(Long id) {
		boolean status=false;
		try {
			Student std=getStudentDetailsById(id);
			if(std!=null) {
				studentRepository.delete(std);
				status=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}}





	




	
	
