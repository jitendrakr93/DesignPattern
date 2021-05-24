package com.jit.test;

import com.jit.dao.DAO;
import com.jit.factory.ExcelDAOFactory;

public class GoodClientApp {
	public static void main(String[] args) {
		DAO stDAO = ExcelDAOFactory.createDAO("student");
		DAO crsDAO = ExcelDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}
