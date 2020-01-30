package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.ProvinDao;
import domain.Province;
import utils.MyBatisUtils;

public class Test {

	public static void main(String[] args) {
		SqlSession sqlSession=MyBatisUtils.getSqlSession();
		ProvinDao provinDao = sqlSession.getMapper(dao.ProvinDao.class);
		Province provinces =  provinDao.selectProvinceById(1);
		System.out.println(provinces);

		
		sqlSession.commit();
		System.out.println("success ");
		if (sqlSession!=null) {
			sqlSession.close();
		}
	}

}
