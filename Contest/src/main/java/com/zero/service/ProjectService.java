package com.zero.service;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.bean.Project;
import com.zero.bean.ProjectExample;
import com.zero.bean.ProjectExample.Criteria;

import com.zero.dao.ProjectMapper;
@Service
public class ProjectService {
	@Autowired
	ProjectMapper projectMapper;
	
	public void savePro(Project project) {
		projectMapper.insertSelective(project);

	}

	
	public List<Project> getAll_check() {
		ProjectExample example=new ProjectExample();
		Criteria criteria=example.createCriteria();
		criteria.andProjectCheckEqualTo(0);
		List<Project> list=projectMapper.selectByExampleWithName(example);
		return list;
	}
	public List<Project> getAll() {
		return projectMapper.selectByExampleWithName(null);
	}


	public void deleteProById(Integer id) {
		// TODO Auto-generated method stub
		ProjectExample example=new ProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andStudentIdEqualTo(id);
		projectMapper.deleteByExample(example);
	}


	public void checkPro(Integer id) {
		ProjectExample example = new ProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andStudentIdEqualTo(id);
		Project project = new Project();
		project.setProjectCheck(1);
		projectMapper.updateByExampleSelective(project, example);
	}


	public List<Project> getAll_checked() {
		ProjectExample example=new ProjectExample();
		Criteria criteria=example.createCriteria();
		criteria.andProjectCheckEqualTo(1);
		List<Project> list=projectMapper.selectByExampleWithName(example);
		return list;
	}


	public List<Project> getsearch(Map<String, Object> searchParam) {
		List<Project> list=projectMapper.search(searchParam);
		return list;
	}











}
