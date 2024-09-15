import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.hrbank.Customer;
import com.hrbank.CustomerDao;
import com.hrbank.Employee;
import com.hrbank.EmployeeDao;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to HR bank services");
		System.out.println("**********************************************");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Manage Employees");
			System.out.println("Press 2 to Manage Customers");
			System.out.println("Press 0 to exit");
			
			int op = Integer.parseInt(br.readLine());
			
			if(op==1) {
				System.out.println("Press 1 to Add Employee");
				System.out.println("Press 2 to See Employees");
				System.out.println("Press 3 to Delete Employee");
				System.out.println("Press 4 for Main menu");
				
				int choice = Integer.parseInt(br.readLine());
				
				if(choice==1) {
					System.out.print("Enter Employee Name: ");
			        String name = br.readLine();

			        System.out.print("Enter Employee Age: ");
			        int age = Integer.parseInt(br.readLine());

			        System.out.print("Enter Employee Sex (M/F): ");
			        String sex = br.readLine();

			        System.out.print("Enter Employee Mobile Number: ");
			        long mobile = Long.parseLong(br.readLine());

			        System.out.print("Enter Employee Address: ");
			        String address = br.readLine();
			        
			        Employee emp = new Employee(name, age, sex, mobile, address);
			        System.out.println(emp);
			        boolean result = EmployeeDao.AddEmployee(emp);
			        
			        if(result) {
			        	System.out.println("Employee Added Successfully");
			        }else {
			        	System.out.println("Failed to Add! Please try again");
			        }
			        System.out.println("**********************************************");
				}
				
				else if(choice==2) {
					EmployeeDao.ListEmployee();
				}
				
				else if(choice==3) {
					System.out.print("Enter Employee Id: ");
			        int id = Integer.parseInt(br.readLine());
			        boolean result = EmployeeDao.DeleteEmployee(id);
			        
			        if(result) {
			        	System.out.println("Employee Deleted Successfully");
			        }else {
			        	System.out.println("Failed to Delete! Please try again");
			        }
			        System.out.println("**********************************************");
				}
				
				else if(choice==4){
					break;
				}
			}else if(op==0) {
				break;
			}
			
			else if(op==2) {
				System.out.println("Press 1 to Register Customer");
				System.out.println("Press 2 to Show Customers");
				System.out.println("Press 3 to Login Customer");
				System.out.println("Press 4 to Delete Customer");
				System.out.println("Press 5 for Main menu");
				
				int choice = Integer.parseInt(br.readLine());
				if(choice==1) {
					System.out.print("Enter Customer Name: ");
			        String name = br.readLine();

			        System.out.print("Enter Customer Age: ");
			        int age = Integer.parseInt(br.readLine());

			        System.out.print("Enter Customer Sex (M/F): ");
			        String sex = br.readLine();

			        System.out.print("Enter Customer Mobile Number: ");
			        long mobile = Long.parseLong(br.readLine());

			        System.out.print("Enter Customer Address: ");
			        String address = br.readLine();
			        
			        System.out.print("Enter Customer Username: ");
			        String uname = br.readLine();
			        
			        System.out.print("Enter Customer Password: ");
			        String upass = br.readLine();
			        
			        Customer cust = new Customer(name, age, sex, mobile, address, uname, upass);
			        System.out.println(cust);
			        boolean result = CustomerDao.AddCustomer(cust);
			        
			        if(result) {
			        	System.out.println("Customer Added Successfully");
			        }else {
			        	System.out.println("Failed to Add! Please try again");
			        }
			        System.out.println("**********************************************");
				}
				
				else if(choice==2) {
					CustomerDao.ListCustomer();
				}
				
				else if(choice==3) {
					
					System.out.print("Enter Customer Username: ");
			        String uname = br.readLine();
			        
			        System.out.print("Enter Customer Password: ");
			        String upass = br.readLine();
					Customer customer = CustomerDao.LoginCustomer(uname, upass);
					
					if (customer != null) {
			            System.out.println("Login successful! Customer details: " + customer);
			        } else {
			            System.out.println("Login failed. Invalid credentials.");
			        }
					System.out.println("**********************************************");
				}
				
				else if(choice==4) {
					System.out.print("Enter Customer Id: ");
			        int id = Integer.parseInt(br.readLine());
			        boolean result = CustomerDao.DeleteCustomer(id);
			        
			        if(result) {
			        	System.out.println("Customer Deleted Successfully");
			        }else {
			        	System.out.println("Failed to Delete! Please try again");
			        }
			        System.out.println("**********************************************");
				}
				
				else if(choice==5){
					break;
				}
			}
		}

	}

}
