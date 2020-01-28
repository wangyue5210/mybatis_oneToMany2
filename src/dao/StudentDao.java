package dao;

import java.util.List;

import domain.Student;

public interface StudentDao {
	
	void insertStudent(Student student);
	void deleteStudentById(String id);
	void updateStudent(Student student);
	
	List<Student> selectAllStudents();
	Student selectStudentById(String id);
	List<Student> selectStudentByName(String name);
	

}
