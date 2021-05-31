package com.jit.factory;

import com.jit.dao.DAO;

public interface DAOFactory {
	public DAO createDAO(String type);
}
