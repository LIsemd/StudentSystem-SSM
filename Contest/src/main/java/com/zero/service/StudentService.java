package com.zero.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.bean.Student;
import com.zero.bean.StudentExample;
import com.zero.bean.StudentExample.Criteria;
import com.zero.dao.StudentMapper;
@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	public boolean checkid(Integer studentId) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStudentIdEqualTo(studentId);
		long count = studentMapper.countByExample(example);
		return count==0;
	}

}
