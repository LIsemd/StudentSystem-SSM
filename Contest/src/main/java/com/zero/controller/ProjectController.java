package com.zero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zero.bean.Msg;
import com.zero.bean.Project;
import com.zero.bean.Student;
import com.zero.service.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	
	
	@ResponseBody
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public Msg deleteProById(@PathVariable("id")Integer id) {
		projectService.deleteProById(id);
		return Msg.success();
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg savePro(Project project) {
		projectService.savePro(project);
		return Msg.success();
		
	}

	//搜索
		@RequestMapping("/search")
		@ResponseBody
		public Msg search(@RequestParam(value="studentName",required = false,defaultValue = "") String studentName,
				@RequestParam(value="pn",required = false,defaultValue="1")Integer pn) {
			Map<String,Object> searchParam = new HashMap<String,Object>();
			searchParam.put("studentName", studentName);
			PageHelper.startPage(pn,8);
			List<Project> searchlist=projectService.getsearch(searchParam);
			for (Project project : searchlist) {
				System.out.println(project.getStudentId());
			}
			PageInfo page = new PageInfo(searchlist, 8);
			return Msg.success().add("pageInfo",page);
		}

	
	@RequestMapping(value="/confirm/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Msg checkPro(@PathVariable("id")Integer id) {
		
		projectService.checkPro(id);
		
		return Msg.success();
	}

	//要到全部学生信息
	@RequestMapping("/pros")
	@ResponseBody
	public Msg getProsWithJson(
		@RequestParam(value="pn",defaultValue="1")Integer pn) {
		PageHelper.startPage(pn,8);
		List<Project> pros = projectService.getAll();
		PageInfo page = new PageInfo(pros, 8);
		return Msg.success().add("pageInfo",page);
	}
	@RequestMapping("/checked")
	@ResponseBody
	public Msg getProsWithJson_checked(
		@RequestParam(value="pn",defaultValue="1")Integer pn) {
		PageHelper.startPage(pn,8);
		List<Project> pros = projectService.getAll_checked();
		PageInfo page = new PageInfo(pros, 8);
		return Msg.success().add("pageInfo",page);
	}
	//要到未审核的学生信息
	@RequestMapping("/proc")
	@ResponseBody
	public Msg getProsWithJson_unchecked(
		@RequestParam(value="pn",defaultValue="1")Integer pn) {
		PageHelper.startPage(pn,8);
		List<Project> pros = projectService.getAll_check();
		PageInfo page = new PageInfo(pros, 8);
		return Msg.success().add("pageInfo",page);
	}


}
