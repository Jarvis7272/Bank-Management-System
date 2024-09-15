package com.hrbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {

	public static boolean AddCustomer(Customer cust) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			Connection con = ConnectionProvider.connectionp();
			
			String query = "Insert into customer(name, age, sex, mobile, address, uname, upass) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, cust.getName());
			ps.setInt(2, cust.getAge());
			ps.setString(3, cust.getSex());
			ps.setLong(4, cust.getMobile());
			ps.setString(5,  cust.getAddress());
			ps.setString(6, cust.getUname());
			ps.setString(7, cust.getUpass());
			
			ps.executeUpdate();
			
			res = true;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return res;
	}

	public static Customer LoginCustomer(String uname, String upass) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = ConnectionProvider.connectionp();
			
			String query = "Select * from customer where uname = ? and upass = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, upass);
			
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				int id = set.getInt("id");
				String name = set.getString("name");
				int age = set.getInt("age");
				String sex = set.getString("sex");
				long mobile = set.getLong("mobile");
				String address = set.getString("address");
				return new Customer(id, name, age, sex, mobile, address);
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return null;
		
		
	}

	public static boolean DeleteCustomer(int id) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			Connection con = ConnectionProvider.connectionp();
			String query = "Delete from customer where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			res = true;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return res;
	}

	public static void ListCustomer() {
		// TODO Auto-generated method stub
		try {
	        Connection con = ConnectionProvider.connectionp();
	        
	        String query = "SELECT * FROM customer";
	        PreparedStatement ps = con.prepareStatement(query);
	        
	        ResultSet set = ps.executeQuery();
	        
	        System.out.printf("%-5s | %-15s | %-5s | %-5s | %-15s | %-30s%n", "ID", "Name", "Age", "Sex", "Phone", "Address");
	        System.out.println("--------------------------------------------------------------------------");
	        while(set.next()) {
	        	int id = set.getInt("id");
                String username = set.getString("uname");
                String password = set.getString("upass");
                String name = set.getString("name");
                int age = set.getInt("age");
                String sex = set.getString("sex");
                long mobile = set.getLong("mobile");
                String address = set.getString("address");

                System.out.printf("%-5d | %-15s | %-15s | %-15s | %-5d | %-5s | %-15d | %-30s%n", 
                        id, username, password, name, age, sex, mobile, address);
	        }
	    } catch(SQLException ex) {
	        ex.printStackTrace();  
	    }
		
	}
	

}
