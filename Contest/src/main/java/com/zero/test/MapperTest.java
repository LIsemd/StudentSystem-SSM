package com.zero.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zero.dao.ProjectMapper;

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations={"classpath:applicationContext.xml"})
	public class MapperTest {
		
		@Autowired
		ProjectMapper projectMapper;
		
		@Autowired
		SqlSession sqlSession;
		
		@Test
		public void testCRUD(){

			System.out.println(projectMapper);

		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	