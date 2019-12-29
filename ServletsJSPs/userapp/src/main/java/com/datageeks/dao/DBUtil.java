package com.datageeks.dao;




import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;


public class DBUtil {
	private static final BasicDataSource dataSource ;
	
		static
		{
			synchronized (DBUtil.class) {
				
				dataSource = new BasicDataSource();
				dataSource.setUsername("system");
				dataSource.setPassword("tiger");
				dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
				dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
			}
		}

		public static DataSource getDataSource()
		{
			return dataSource;
		}
}
