package com.datageeks.service;

import java.util.List;

import com.datageeks.dao.DataSourceException;
import com.datageeks.dao.User;
import com.datageeks.dao.UserDAO;

public class UserService {
	
	private UserDAO userDAO = new UserDAO();
	
	public List<User> getAll() throws ServicesException
	{
		 List<User> userList = null;
		try
		{
			userList  = userDAO.getAll();
		}catch(DataSourceException exp)
		{
			exp.printStackTrace();
			throw new ServicesException(exp.getMessage());
		}
		
		return userList;
	}

}
