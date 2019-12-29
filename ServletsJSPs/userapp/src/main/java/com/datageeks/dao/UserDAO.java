package com.datageeks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class UserDAO {
	
	private DataSource dataSource = DBUtil.getDataSource();
	
	public List<User> getAll() throws DataSourceException
	{
		String sql = " Select Login_Id, First_Name , Last_Name From Users ";
		List<User>  usersList = new ArrayList<User>();
		
			try
			{
				Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					User user = new User();
					user.setFirstName(rs.getString("First_Name"));
					user.setLastName(rs.getString("Last_Name"));
					user.setLoginId(rs.getString("Login_Id"));
					usersList.add(user);
				}
				
			}catch(SQLException exp)
			{
				exp.printStackTrace();
				throw new DataSourceException(exp.getMessage());
			}
		
		return usersList;
	}

}
