package classes;

import java.lang.*;

public class PostPaid extends Sim
{
	private double monthlyBill;
	
	public PostPaid(){}
	public PostPaid(String simNumber, Customer customer, double balance, String registredNumber, double monthlyBill)
	{
		super(simNumber, customer, balance, registredNumber);
		this.monthlyBill = monthlyBill;
	}
	
	public void setMonthlyBill(double monthlyBill){this.monthlyBill = monthlyBill;}
	public double getMonthlyBill(){return monthlyBill;}
	
	public void showDetails()
	{
		System.out.println("**** Sim Information ****");
		this.getCustomer().showDetails();
		System.out.println("Sim Number: " + this.getSimNumber());
		System.out.println("Sim Balance: " + this.getBalance());
		System.out.println("Sim Registred Number: " + this.getRegistredNumber());
		System.out.println("Monthly Bill: " + monthlyBill);
		System.out.println();
	}
}