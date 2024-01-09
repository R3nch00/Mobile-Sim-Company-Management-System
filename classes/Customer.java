package classes;
import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	
	public void showDetails()
	{
		System.out.println("User NID number: " + nid);
		System.out.println("User Name: " + name);
		System.out.println();
	}
}