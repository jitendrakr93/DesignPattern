package com.jit.test;

import com.jit.dao.DAO;
import com.jit.factory.DAOFactory;
import com.jit.factory.DAOFactoryBuilder;

public class GoodClientApp {
	public static void main(String[] args) {
		DAOFactory dbDAOFactory = DAOFactoryBuilder.buildDAOFactory("EXCEL");
		DAO stDAO = dbDAOFactory.createDAO("student");
		DAO crsDAO = dbDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}
