package com.zero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zero.bean.Teacher;
import com.zero.bean.TeacherExample;
import com.zero.bean.TeacherExample.Criteria;

import com.zero.dao.TeacherMapper;

@Service
public class TeacherService {

		@Autowired
		TeacherMapper teacherMapper;
		
		public String getteacherPassword(String teacherId) {
			Teacher str=teacherMapper.selectByPrimaryKey(teacherId);
			return str.getTeacherPassword();
		}
		
		public boolean checktid(String teacherId) {
			TeacherExample example = new TeacherExample();
			Criteria criteria = example.createCriteria();
			criteria.andTeacherIdEqualTo(teacherId);
			long count = teacherMapper.countByExample(example);
			return count==0;
		}
		

}
