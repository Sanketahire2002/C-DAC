/** 
* @author Sanket Ahire
*/

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Company {
	
	private static final int generateID() {
		LocalDateTime now = LocalDateTime.now();
        Instant instant = now.toInstant(ZoneOffset.UTC);
        long millis = instant.toEpochMilli();
        int millisAsInt = (int) millis;
		return millisAsInt;
	}
	
	public static void main(String[] args) throws IOException {
		Employee[] emp = new Employee[5];
		final int size = 5;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			for (Employee employee : emp)
				employee = null;
			
			System.out.println("********** Welcome to Manager Dashboard **********");
			System.out.println("************* " + Employee.getCompanyname() + "*************");
			while(true)
			{
				System.out.println("\n----------------------------------------------");
				System.out.println("1. Add New Employee in company.");
				System.out.println("2. Get Total Number of Employees in a company.");
				System.out.println("3. Get Total Salary Expenses of company on Employees.");
				System.out.println("4. Get All Employees Details.");
				System.out.println("5. Get Employee Details by ID.");
				System.out.println("6. Get Employee Details by Name.");
				System.out.println("7. Give raise to all Employees.");
				System.out.println("8. Fire the Employee.");
				System.out.println("0. Exit.");
				System.out.print("\nEnter your choice: ");
				int choice = -1;
				
				try
				{
					choice = sc.nextInt();
				}catch(java.util.InputMismatchException nfe) {
					sc.nextLine();
					nfe.printStackTrace();
				}catch(Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
				System.out.println("\n----------------------------------------------");
				
				switch (choice) {
				case 1:
					if(Employee.getTotalEmployees() == size)
						System.out.println("Company size is full. Cannot hire new Employee. Sorry for Inconvince. Please Choose other option.");
					else
					{
						Employee e = null;
						for(int loop = 0; loop < emp.length; loop++) 
						{
							if(emp[loop] == null)
							{
								emp[loop] = new Employee(LocalDateTime.now(),generateID());
								e = emp[loop];
								break;
							}
						}						
					
						System.out.print("Enter Name of Employee : ");
						String name = reader.readLine();
						sc.nextLine();
						System.out.print("Enter salary (in Rs.): ");
						float salary = sc.nextFloat();
						System.out.print(name);
						System.out.print(salary);
						try {
							e.setEmployeeName(name);
							e.setEmployeeSalary(salary);
							Employee.setTotalSalaryExpense(Employee.getTotalSalaryExpense()+salary);
						}catch(NullPointerException npe) {
							npe.printStackTrace();
						}catch(Exception eee) {
							eee.printStackTrace();
						}
						System.out.println("Congratulations. New Employee Addedd Successfully.");
						
						
					}
					break;
				
				case 2:
					System.out.println("Total number of Employees: "+Employee.getTotalEmployees());
					break;
				
				case 3:
					System.out.println("Total Salary Expenses: "+Employee.getTotalSalaryExpense()+" Rs.");
					break;
					
				case 4:
					if(Employee.getTotalEmployees() == 0)
						System.out.println("Company has no Employee yet. Please hire new Employee.");
					else
					{
						for (Employee employee : emp) 
							if(employee != null)
								System.out.println(employee);
					}							
					break;
				
				case 5:
					boolean flag = false;
					System.out.print("Enter ID to search: ");
					int ID = sc.nextInt();
					for (Employee employee : emp)
						if(employee != null)
							if(employee.getEmployeeID() == ID)
							{
								flag = true;
								System.out.println(employee);
								break;
							}
					if(flag == false)
						System.out.println("Employee Not Found with Id "+ID);
					break;
					
				case 6:
					flag = false;
					System.out.print("Enter Name to search: ");
					sc.nextLine();
					String name = sc.nextLine();
					for (Employee employee : emp)
						if(employee != null)
							if(employee.getEmployeeName().equalsIgnoreCase(name))
							{
								flag = true;
								System.out.println(employee);
							}
							
					if(flag == false)
						System.out.println("Employee Not Found with Name "+name);
					break;
					
				case 7:
					System.out.print("Amount to raise to all employees (in Rs.): ");
					float salary = sc.nextFloat();
					for (Employee employee : emp) {
						if(employee != null)
							employee.updateSalary(salary);
					}
					System.out.println("Amount raised Successfully. Company Total Salary Expenses: "+Employee.getTotalSalaryExpense());
					break;
				
				case 8:
					System.out.print("Enter ID of Employee to be Fire: ");
					ID = sc.nextInt();
					flag = false;
					for (int loop = 0; loop < emp.length; loop++)
					{
						if(emp[loop] != null)
							if(emp[loop].getEmployeeID() == ID)
							{
								flag = true;
								System.out.println(emp[loop]);
								emp[loop] = null;
								Employee.setTotalEmployees(Employee.getTotalEmployees() - 1);
								break;
							}
					}
					
					if(flag == false)
						System.out.println("Employee Not Found with Id "+ID);
					else
						System.out.println("Employee fired Successfully with ID "+ID);
					break;
					
				case 0:
					System.out.println("Thank you .....");
					System.exit(choice);
						
				default: 
					System.out.println("Please Enter Correct Choice .....");
					break;
				}
			}
		}
	}
}

class Employee
{
	private static final String companyName;
	private static int totalEmployees;
	private static float totalSalaryExpense;
	private final LocalDateTime joinDateTime;
	private final int employeeID;
	private String employeeName;
	private float employeeSalary;
	
	static
	{
		companyName = "Infosys";
	}
	
	public Employee(LocalDateTime now, int employeeID) {
		this.joinDateTime = now;
		if(employeeID > 0)
			this.employeeID = employeeID;
		else
			this.employeeID = -employeeID;
		Employee.totalEmployees++;
	}
	
	public static String getCompanyname() {
		return companyName;
	}
	public static int getTotalEmployees() {
		return totalEmployees;
	}
	public static void setTotalEmployees(int totalEmployees) {
		Employee.totalEmployees = totalEmployees;
	}
	public static float getTotalSalaryExpense() {
		return totalSalaryExpense;
	}
	public static void setTotalSalaryExpense(float totalSalaryExpense) {
		Employee.totalSalaryExpense = totalSalaryExpense;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public String toString() {
		return ("Employee [joinDateTime=" + joinDateTime + ", employeeID=" + employeeID + ", employeeName=" + this.employeeName + ", employeeSalary=" + employeeSalary + "]");
	}
	
	public void updateSalary(float newSalary) {
		this.employeeSalary += newSalary;
		Employee.totalSalaryExpense += newSalary;
	}	
}