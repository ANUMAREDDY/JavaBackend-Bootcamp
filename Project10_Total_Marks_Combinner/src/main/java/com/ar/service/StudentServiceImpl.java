package com.ar.service;

import com.ar.bo.StudentBO;
import com.ar.dao.IStudentDAO;
import com.ar.dto.StudentDTO;

public class StudentServiceImpl implements IStudentService {
	private IStudentDAO dao;
	
	public StudentServiceImpl(IStudentDAO dao) {
		System.out.println("Service constructor 1-param");
		this.dao=dao;
	}

	@Override
	public String calculateTotalMarks(StudentDTO dto) throws Exception {
		Float totalMarks=(dto.getTelugu()+dto.getEnglish()+dto.getMathematics()+dto.getScience()+dto.getSocial());
		
		StudentBO bo=new StudentBO();
		bo.setStudentName(dto.getStudentName());
		bo.setStudentClass(dto.getStudentClass());
		bo.setExam(dto.getExam());
		bo.setTelugu(dto.getTelugu());
		bo.setEnglish(dto.getEnglish());
		bo.setMathematics(dto.getMathematics());
		bo.setScience(dto.getScience());
		bo.setSocial(dto.getSocial());
		bo.setTotalMarks(totalMarks);
		
		int count= dao.insert(bo);
		
		return count==1?"Student details are registered,Total Score:"+totalMarks:"Student is not registered";
	}

}
