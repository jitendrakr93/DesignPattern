package com.jit.factory;

import com.jit.dao.DAO;
import com.jit.dao.ExcelCourseDAO;
import com.jit.dao.ExcelStudentDAO;

public class ExcelDAOFactory implements DAOFactory{
	public  DAO createDAO(String type) {
		if (type.equalsIgnoreCase("student")) {
			return new ExcelStudentDAO();
		}
		else if(type.equalsIgnoreCase("course")) {
			return new ExcelCourseDAO();
		}else
			throw new IllegalArgumentException("Invalid DAO Type");
	}
}
