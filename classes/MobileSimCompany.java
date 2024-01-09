package classes;

import java.lang.*;
import interfaces.*;

public class MobileSimCompany implements SimOperations, EmployeeOperations, CustomerOperations
{
	private String name,customerCareName;
	private Sim sims[] = new Sim [1000];
	private Customer customers[] = new Customer [500];
	private Employee employees[] = new Employee [100];
	
	public MobileSimCompany(){}
	public MobileSimCompany(String name, String customerCareName)
	{
		this.name = name;
		this.customerCareName = customerCareName;
	}
	
	public void setName(String name){this.name = name;}
	public void setCustomerCareName(String customerCareName){this.customerCareName = customerCareName;}
	
	public String getName(){return name;}
	public String getCustomerCareName(){return customerCareName;}

	public boolean insertSim(Sim s)
	{
		for(int i=0; i<sims.length; i++)
		{
			if(sims[i] == null)
			{
				sims[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeSim(Sim s)
	{
		for(int i=0; i<sims.length; i++)
		{
			if(sims[i] == s)
			{
				sims[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Sim searchSim(String simNumber)
	{
		for(int i=0; i<sims.length; i++)
		{
			if(sims[i] != null)
			{
				if(sims[i].getSimNumber().equals(simNumber))
				{
					return sims[i];
				}
			}
		}
		return null;
	}
	
	public void showAllSims()
	{
		for(int i=0; i<sims.length; i++)
		{
			if(sims[i] != null)
			{
				sims[i].showDetails();
			}
		}
	}
	
	
	public boolean insertCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Customer searchCustomer(int nid)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getNid() == nid)
				{
					return customers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCustomers()
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				customers[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Mobile Sim Company : " + name);
		System.out.println("Mobile Sim Customer Care: " + customerCareName);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Sim ###");
		this.showAllSims();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Employee ###");
		this.showAllEmployees();
		System.out.println("//////////////////////////////////");
		
	}	
}