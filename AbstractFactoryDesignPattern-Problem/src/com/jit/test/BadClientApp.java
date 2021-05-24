package com.jit.test;

import com.jit.dao.DAO;
import com.jit.factory.DBDAOFactory;
import com.jit.factory.ExcelDAOFactory;

public class BadClientApp {
	public static void main(String[] args) {
		DAO stDAO = ExcelDAOFactory.createDAO("student");
		DAO crsDAO = DBDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}
