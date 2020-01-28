package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.StudentDao;
import domain.Student;
import utils.MyBatisUtils;

public class StudentDaoImpl implements StudentDao {

	private SqlSession sqlSession;

	@Override
	public void insertStudent(Student student) {
		try {
			sqlSession=MyBatisUtils.getSqlSession();
			sqlSession.insert("save", student);
			sqlSession.commit();
		} finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
			
		}

	}

	@Override
	public Student selectStudentById(String id) {
		
		Student student=null;
		try {
			sqlSession=MyBatisUtils.getSqlSession();
			 student = sqlSession.selectOne("getByNo", id);
			sqlSession.commit();
		} finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
			
		}
		return student;

	}

	@Override
	public void updateStudent(Student student) {
		try {
			sqlSession=MyBatisUtils.getSqlSession();
			sqlSession.update("update", student);
			sqlSession.commit();
		} finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
			
		}

	}

	@Override
	public List<Student> selectAllStudents() {
		List<Student> studentList=null;
		try {
			sqlSession=MyBatisUtils.getSqlSession();
			studentList = sqlSession.selectList("getAll");
			sqlSession.commit();
		} finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
			
		}
		return studentList;
	}

	@Override
	public void deleteStudentById(String id) {
		try {
			sqlSession=MyBatisUtils.getSqlSession();
			sqlSession.delete("deleteByNo", id);
			sqlSession.commit();
		} finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
			
		}
		
	}

	@Override
	public List<Student> selectStudentByName(String name) {
		
		List<Student> studentList=null;
		try {
			sqlSession=MyBatisUtils.getSqlSession();
			studentList = sqlSession.selectList("selectStudentByName",name);
			sqlSession.commit();
		} finally {
			if (sqlSession!=null) {
				sqlSession.close();
			}
			
		}
		return studentList;
	}

}
