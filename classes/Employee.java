package classes;
import java.lang.*;

public class Employee
{
	private String empId,empName;
	private double salary;
	
	public void setEmpId(String empId){this.empId = empId;}
	public void setEmpName(String empName){this.empName = empName;}
	public void setSalary(double salary){this.salary = salary;}
	
	public String getEmpId(){return empId;} 
	public String getName(){return empName;}
	public double getSalary(){return salary;} 
	
	public void showDetails()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + salary);
		System.out.println();
	}
}