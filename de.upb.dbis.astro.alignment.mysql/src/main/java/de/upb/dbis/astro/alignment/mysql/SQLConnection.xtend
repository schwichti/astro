package de.upb.dbis.astro.alignment.mysql

import java.sql.SQLException
import java.sql.DriverManager
import java.sql.Connection

class SQLConnection {
	
	
	public static Connection INSTANCE = null;
	
	public static def Connection getConnection(){
		if(INSTANCE===null){
			connect();
		}
		return INSTANCE;
	}
	
	private new(){
		
	}
	
	private static def void connect(){
		try {
			// Setup the connection with the DB
			INSTANCE = DriverManager
					.getConnection("jdbc:mysql://localhost/alignment?"
							+ "user=root&serverTimezone=UTC");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
