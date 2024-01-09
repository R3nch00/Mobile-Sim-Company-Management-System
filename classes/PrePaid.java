package classes;

import java.lang.*;

public class PrePaid extends Sim
{
	private String validityDate;
	
	public PrePaid(){}
	public PrePaid(String simNumber, Customer customer, double balance, String registredNumber, String validityDate)
	{
		super(simNumber, customer, balance, registredNumber);
		this.validityDate = validityDate;
	}
	
	public void setValidityDate(String validityDate){this.validityDate = validityDate;}
	public String getValidityDate(){return validityDate;}
	
	public void showDetails()
	{
		System.out.println("**** Sim Information ****");
		this.getCustomer().showDetails();
		System.out.println("Sim Number: " + this.getSimNumber());
		System.out.println("Sim Balance: " + this.getBalance());
		System.out.println("Sim Registred Number: " + this.getRegistredNumber());
		System.out.println("Validity Date: " + validityDate);
		System.out.println();
	}
}