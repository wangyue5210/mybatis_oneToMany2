package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.StudentDao;
import domain.Student;
import utils.MyBatisUtils;

public class Test {

	public static void main(String[] args) {
		SqlSession sqlSession=MyBatisUtils.getSqlSession();
		StudentDao studentDao=sqlSession.getMapper(dao.StudentDao.class);
		
		/*
		//插入
		Student student=new Student("A101", "小明", 18);
		studentDao.insertStudent(student);
	
		
		
		//删除
		 studentDao.deleteStudentById("A100");
		 
		 //修改
		Student student=new Student("A101", "小明明", 18);
		studentDao.updateStudent(student);
	    
	    //返回所有
	    List<Student> studentList=new ArrayList<Student>();
		studentList=studentDao.selectAllStudents();
		System.out.println(studentList);
		
		//查询一条
		Student studentRes = studentDao.selectStudentById("A001");
		System.out.println(studentRes);
		System.out.println("success");
		*/
		//模糊查询
		List<Student> studentList=new ArrayList<Student>();
		studentList = studentDao.selectStudentByName("张");
		System.out.println(studentList);
		sqlSession.commit();
		System.out.println("success mapper dynamic proxy");
		if (sqlSession!=null) {
			sqlSession.close();
		}
	}

}
