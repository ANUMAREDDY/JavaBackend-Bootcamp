package com.ar.controller;

import com.ar.dto.StudentDTO;
import com.ar.service.IStudentService;
import com.ar.vo.StudentVO;

public class MainController {
	
	private IStudentService service;
	
	public MainController(IStudentService service) {
		this.service=service;
	}
	
	public String processStudent(StudentVO vo)throws Exception {
		
		StudentDTO dto=new StudentDTO();
		
		dto.setStudentName(vo.getStudentName());
		dto.setExam(vo.getExam());
		dto.setStudentClass(Float.parseFloat(vo.getStudentClass()));
		dto.setTelugu(Float.parseFloat(vo.getTelugu()));
		dto.setEnglish(Float.parseFloat(vo.getEnglish()));
		dto.setMathematics(Float.parseFloat(vo.getMathematics()));
		dto.setScience(Float.parseFloat(vo.getScience()));
		dto.setSocial(Float.parseFloat(vo.getSocial()));
		
		String result=service.calculateTotalMarks(dto);
		
		return result;
		
		
		
	}

}
