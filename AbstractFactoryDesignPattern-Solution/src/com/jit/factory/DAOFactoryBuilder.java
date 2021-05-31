package com.jit.factory;

public class DAOFactoryBuilder {

	//Abstract factory logic :: method returning one of factories onject
	public static DAOFactory buildDAOFactory(String storeType) {
		if(storeType.equalsIgnoreCase("DB"))
			return new DBDAOFactory();
		else if(storeType.equalsIgnoreCase("EXCEL"))
			return new ExcelDAOFactory();
		else
			throw new IllegalArgumentException("Invalid store types");
	}
}
