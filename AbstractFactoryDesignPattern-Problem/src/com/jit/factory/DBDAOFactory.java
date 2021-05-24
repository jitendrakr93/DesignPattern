package com.jit.factory;

import com.jit.dao.DAO;
import com.jit.dao.DBCourseDAO;
import com.jit.dao.DBStudentDAO;

public class DBDAOFactory {
	public static DAO createDAO(String type) {
		if (type.equalsIgnoreCase("student")) {
			return new DBStudentDAO();
		}
		else if(type.equalsIgnoreCase("course")) {
			return new DBCourseDAO();
		}else
			throw new IllegalArgumentException("Invalid DAO Type");
	}
}
