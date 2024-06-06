package com.nopecommerce.DataBaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	
	Connection conn;
	Statement state;
	ResultSet set;
	
	
	public Connection cinnectingToTheDatabase(String url, String username, String password) throws SQLException {
		try {
		Driver dirver= new Driver();
		DriverManager.registerDriver(dirver);
		conn = DriverManager.getConnection(url, username, password);
	   
	}
		catch (Exception e) {
			// TODO: handle exception
		} return conn;
	}
	public ResultSet excutingTheSelectQurey(String query) throws SQLException
	{try {
		state= conn.createStatement();
		 set = state.executeQuery(query);}
	catch (Exception e) {
		// TODO: handle exception
	}
		return set;
	
	}
	public int executingTheNonSelectQuery(String update) throws SQLException {
		int num=0;
		try {
		num= state.executeUpdate(update);}
		catch (Exception e) {
			// TODO: handle exception
		}
		return num;
	}
	public void closingTheDataBaseConnection() throws SQLException
	{
		conn.close();
	}
	

	}


