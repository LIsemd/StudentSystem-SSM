package com.zero.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.zero.bean.Project;
import com.zero.bean.Student;
import com.zero.bean.Teacher;
import com.zero.dao.ProjectMapper;
import com.zero.dao.StudentMapper;
import com.zero.dao.TeacherMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class mappertests {
	@Autowired
	SqlSession SqlSession;
	@Test
		public void test() {
		
		ProjectMapper projectMapper=SqlSession.getMapper(ProjectMapper.class);
		Map<String, Object> searchParam = new HashMap<String, Object>();
		searchParam.put("studentName", "п║аж");
		List<Project> list=projectMapper.search(searchParam);
		for (Project project : list) {
			System.out.println(project.getId());
		}
		
		
	}


}