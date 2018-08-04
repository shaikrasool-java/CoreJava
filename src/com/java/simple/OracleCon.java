package com.java.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleCon {

	public static void main(String[] args) throws SQLException {

		Connection con=null;
		try{
			System.out.println("loading class driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded successfully");
			System.out.println();
			System.out.println("creating connection object");
			 con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			System.out.println("connection object created successully");
			System.out.println();
			System.out.println("creating statement obj");
			Statement st=con.createStatement();
			System.out.println("statement object created successfully");
			System.out.println();
			System.out.println("execute query");
			ResultSet rs=st.executeQuery("select*from employee");
			System.out.println("query executed successfuly");
			while(rs.next()){
			System.out.println("employee id="+rs.getInt(1)+
					"  employee name="+rs.getString(2)+"  employee desg="+rs.getString(5));	
			System.out.println();
			}
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
			
		}
	}
}
