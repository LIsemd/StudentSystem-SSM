package com.zero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.bean.Msg;
import com.zero.service.TeacherService;


@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	
	//µÇÂ½¼ìÑé
	@ResponseBody
	@RequestMapping("/checkTeacher")
	public Msg load(@RequestParam(value="teacherId") String teacherId,
			@RequestParam(value="teacherPassword") String teacherPassword) {
		boolean b = teacherService.checktid(teacherId);
		if(b){
			return Msg.fail();
		}else{
		if(teacherPassword.equals(teacherService.getteacherPassword(teacherId))) {
	
			return Msg.success();
		}
		else
			return Msg.fail();
	}
		}


}

