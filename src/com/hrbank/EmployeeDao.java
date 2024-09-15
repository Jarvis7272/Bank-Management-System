package com.hrbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
	
	public static boolean AddEmployee(Employee emp) throws SQLException {
		
		boolean res = false;
		try {
			Connection con = ConnectionProvider.connectionp();
			
			String query = "Insert into employee(name, age, sex, mobile, address) values(?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getAge());
			ps.setString(3, emp.getSex());
			ps.setLong(4, emp.getMobile());
			ps.setString(5, emp.getAddress());
			
			ps.executeUpdate();
			res = true;
			
			
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}

	public static void ListEmployee() {
	    try {
	        Connection con = ConnectionProvider.connectionp();
	        
	        String query = "SELECT * FROM employee";
	        PreparedStatement ps = con.prepareStatement(query);
	        
	        ResultSet set = ps.executeQuery();
	        
	        System.out.printf("%-5s | %-15s | %-5s | %-5s | %-15s | %-30s%n", "ID", "Name", "Age", "Sex", "Phone", "Address");
	        System.out.println("--------------------------------------------------------------------------");

	        while(set.next()) {
	            int id = set.getInt(1);
	            String name = set.getString(2);
	            int age = set.getInt(3);
	            String sex = set.getString(4);
	            long phone = set.getLong(5);
	            String address = set.getString(6);

	            System.out.printf("%-5d | %-15s | %-5d | %-5s | %-15d | %-30s%n", id, name, age, sex, phone, address);
	        }
	    } catch(SQLException ex) {
	        ex.printStackTrace();  
	    }
	}

	public static boolean DeleteEmployee(int id) throws SQLException {

		boolean res = false;
		try {
			Connection con = ConnectionProvider.connectionp();

			String query = "Delete from employee where id = ?";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1,id);

			ps.executeUpdate();
			res = true;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}
}
