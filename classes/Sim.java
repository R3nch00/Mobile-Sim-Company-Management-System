package classes;

import java.lang.*;
import interfaces.SimTransactions;

public abstract class Sim implements SimTransactions
{	
	private String simNumber;
	private double balance;
	private Customer customer;
	private  String registredNumber;
	
	public Sim(){ }
	public Sim(String simNumber, Customer customer, double balance, String registredNumber)
	{
		this.simNumber = simNumber;
		this.customer = customer;
		this.balance = balance;
		this.registredNumber = registredNumber;
	}
	
	public void setSimNumber(String simNumber){ this.simNumber = simNumber; }
	public void setCustomer(Customer customer){	this.customer = customer;}
	public void setBalance(double balance){	this.balance = balance;	}
	public void setRegistredNumber(String registredNumber){	this.registredNumber = registredNumber;	}
	
	public String getSimNumber(){	return simNumber;}
	public Customer getCustomer(){	return customer;}
	public double getBalance(){	return balance;}
	public String getRegistredNumber(){	return registredNumber;}
	
	public abstract void showDetails();
	
	public boolean recharge(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			return true;
		}
		return false;
	}
	public boolean balanceTransfer(double amount,Sim s)
	{
		if(amount>0)
		{
			
			this.balance -= amount;
			s.balance += amount;
			
			return true;
		}
		return false;
	}
}