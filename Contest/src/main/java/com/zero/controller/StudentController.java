package com.zero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.bean.Msg;
import com.zero.service.StudentService;
@Controller
public class StudentController {
	//检查学号是否存在
	@Autowired
	StudentService studentService;
	@ResponseBody
	@RequestMapping("/checkid")
	public Msg checkid(@RequestParam("studentId") Integer studentId){
		boolean b = studentService.checkid(studentId);
		if(b){
			return Msg.fail();
		}else{
			return Msg.success();
		}
	}
	

}
