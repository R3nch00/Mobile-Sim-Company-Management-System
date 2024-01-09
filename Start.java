import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.FileReadWriteDemo;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		MobileSimCompany  msc = new MobileSimCompany ("TeleTalk", "Gulshan-1");
		
		System.out.println("------------------------------------");
		System.out.println("Welcome to TeleTalk");
		System.out.println("------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("Main Menu\n");
		
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Sim Management");
			System.out.println("\t4. Sim Transactions");
			System.out.println("\t5. Show Mobile msc Company Information");
			System.out.println("\t6. Exit");
			
			System.out.println("\n---------------------------");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("---------------------------");
					System.out.println("Employee Management Selected");
					System.out.println("---------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Employee");
					System.out.println("\t3. Search Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("---------------------------");
							System.out.println("Employee Insertion Selected");
							System.out.println("---------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empid1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String empname1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
								
							Employee emp1 = new Employee();
							
							emp1.setEmpId(empid1);
							emp1.setEmpName(empname1);
							emp1.setSalary(salary1);
								
							if(msc.insertEmployee(emp1))
							{
								System.out.println("*** Employee Inserted, Employee ID: " + emp1.getEmpId() + "  ***");
							}
							else
							{
								System.out.println("*** Employee Not Inserted, Employee ID: " + emp1.getEmpId() + "  ***");
							}			
							
							break;
							
						case 2:
							
							System.out.println("---------------------------");
							System.out.println("Employee Record Removal Selected");
							System.out.println("---------------------------");
							
							System.out.print("Enter  Employee ID to remove an Employee: ");
							String empid2 = sc.next();
							
							Employee emp2 = msc.searchEmployee(empid2);
							
							if(emp2 != null)
							{
								System.out.println("*** Employee Found  ****");
								
								if(msc.removeEmployee(emp2))
								{
									System.out.println("*** Employee Removed, Employee ID: " + emp2.getEmpId() + " ***");
								}
							}
							else
							{
								System.out.println("*** Employee NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("---------------------------");
							System.out.println("Employee Record Search Selected");
							System.out.println("---------------------------");
							
							System.out.print("Enter Employee ID to search an Employee: ");
							String empid3 = sc.next();
							
							Employee emp3 = msc.searchEmployee(empid3);
							
							if(emp3 != null)
							{
								System.out.println("*** Employee Found  ****");
								emp3.showDetails();
							}
							else
							{
								System.out.println("*** Employee NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("---------------------------");
							System.out.println("All Employees List Selected");
							System.out.println("---------------------------");
							
							msc.showAllEmployees();
							
							break;
							
						case 5:
							
							System.out.println("---------------------------");
							System.out.println("Go Back");
							System.out.println("---------------------------");
							
							break;
							
						default:
							
							System.out.println("---------------------------");
							System.out.println("You choose an Invalid Option");
							System.out.println("---------------------------");
							
							break;
					}
					
					break;
		         
				case 2:
					
					System.out.println("---------------------------");
					System.out.println("Customer Management Selected");
					System.out.println("---------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Customer");
					System.out.println("\t3. Search Customer");
					System.out.println("\t4. Show All Customer");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("---------------------------");
							System.out.println("Customer Insertion Selected");
							System.out.println("---------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
								
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
								
							if(msc.insertCustomer(c1))
							{
								System.out.println("*** Customer NID Inserted: " + c1.getNid() + "  ***");
							}
							else
							{
								System.out.println("*** Customer NID NOT Inserted: " + c1.getNid() + "  ***");
							}								
							
							break;
							
						case 2:
							
							System.out.println("---------------------------");
							System.out.println("Customer Removal Selected");
							System.out.println("---------------------------");
							
							System.out.print("Enter  NID to remove a customer: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = msc.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.println("*** Customer Found  ****");
								
								if(msc.removeCustomer(c2))
								{
									System.out.println("*** Customer Removed, NID: " + c2.getNid() + " ***");
								}
							}
							else
							{
								System.out.println("*** Customer NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("---------------------------");
							System.out.println("You have selected Search Customer");
							System.out.println("---------------------------");
							
							System.out.print("Enter the NID to search a customer: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = msc.searchCustomer(nid3);
							
							if(c3 != null)
							{
								System.out.println("*** Customer Found  ****");
								c3.showDetails();
							}
							else
							{
								System.out.println("*** Customer NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("************************************");
							System.out.println(" Show All Customers List Selected");
							System.out.println("************************************");
							
							msc.showAllCustomers();
							
							break;
							
						case 5:
							
							System.out.println("---------------------------");
							System.out.println("Go Back");
							System.out.println("---------------------------");
							
							break;
							
						default:
							
							System.out.println("---------------------------");
							System.out.println("You choose an Invalid Option");
							System.out.println("---------------------------");
							
							break;
					}
					
					break;
					
					case 3:
					
					System.out.println("---------------------------");
					System.out.println("Sim Management Selected");
					System.out.println("---------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Sim");
					System.out.println("\t2. Remove Sim");
					System.out.println("\t3. Search Sim");
					System.out.println("\t4. Show All Sim");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("****************************");
							System.out.println("You have selected Insert Sim");
							System.out.println("****************************");
							
							System.out.print("Enter NID to verify the customer: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = msc.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.println("*** Customer Verified  ***");
								
								Sim s1 = null;
								
								System.out.println("There are two Types of Sim...");
								System.out.println("Which one do you want?");
								System.out.println("\t1. Prepaid Sim");
								System.out.println("\t2. Postpaid Sim");
								System.out.println("\t3. Go back");
								
								System.out.println("\n---------------------------");
								System.out.print("Enter your type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								
								if(type == 1)
								{
									System.out.print("Enter Sim Number: ");
									String sn1 = sc.next();
									System.out.print("Enter Balance: ");
									double b1 = sc.nextDouble();
									System.out.print("Registerd Number: ");
									String rn1 = sc.next();
									System.out.print("Validity Date: ");
									String vd = sc.next();

									PrePaid p = new PrePaid(sn1, c1, b1, rn1, vd);
									s1 = p;
								}
								else if(type == 2)
								{
									System.out.print("Enter Sim Number: ");
									String sn1 = sc.next();
									System.out.print("Enter Balance: ");
									double b1 = sc.nextDouble();
									System.out.print("Registerd Number: ");
									String rn1 = sc.next();
									System.out.print("Monthly Bill: ");
									double mb = sc.nextDouble();

									PostPaid pp = new PostPaid(sn1, c1, b1, rn1, mb);
									s1 = pp;
								}
								else if(type == 3)
								{
									System.out.println("---------------------------");
									System.out.println("Go Back");
									System.out.println("---------------------------");
								}
								else
								{
									System.out.println("---------------------------");
									System.out.println("You choose an Invalid Option");
									System.out.println("---------------------------");
								}
								
								if(s1 != null)
								{
									if(msc.insertSim(s1))
									{
										System.out.println("***  Sim Inserted, Sim Number: " + s1.getSimNumber());
									}
									else
									{
										System.out.println("***  Sim NOT Inserted, Sim Number: " + s1.getSimNumber());
									}
								}
							}
							else
							{
								System.out.println("*** Invalid Customer ***");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("****************************");
							System.out.println("You have selected Remove Sim");
							System.out.println("****************************");
							
							System.out.print("Enter the Sim Number to remove a Sim: ");
							String sn2 = sc.next();
							
							Sim s2 = msc.searchSim(sn2);
							
							if(s2 != null)
							{
								System.out.println("*** Sim Found  ****");
								
								if(msc.removeSim(s2))
								{
									System.out.println("*** Sim Removed, Sim Number: " + s2.getSimNumber() + " ***");
								}
							}
							else
							{
								System.out.println("*** Sim NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("---------------------------");
							System.out.println("You have selected Search Sim");
							System.out.println("---------------------------");
							
							System.out.println("---------------------------");
							System.out.println("You have selected Search Sim");
							System.out.println("---------------------------");
							
							System.out.print("Enter the Sim Number to search a Sim: ");
							String sn3 = sc.next();
							
							Sim s3 = msc.searchSim(sn3);
							
							if(s3 != null)
							{
								System.out.println("*** Sim Found  ****");
								s3.showDetails();
							}
							else
							{
								System.out.println("*** Sim NOT Found  ****");
							}
							
							
							break;
							
						case 4:
							
							System.out.println("*******************************");
							System.out.println("You have selected Show All Sims");
							System.out.println("*******************************");
							
							msc.showAllSims();
							
							break;
							
						case 5:
							
							System.out.println("---------------------------");
							System.out.println("Go Back");
							System.out.println("---------------------------");
							
							break;
							
						default:
							
							System.out.println("********************************");
							System.out.println("You choose an Invalid Option");
							System.out.println("********************************");
							
							break;
					}
					
					break;
					
					case 4:
				
					System.out.println("---------------------------");
					System.out.println("You have selected Sim Transactions");
					System.out.println("---------------------------");
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Recharge");
					System.out.println("\t2. Balance Transfer");
					System.out.println("\t3. Show Transaction History");
					System.out.println("\t4. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println("---------------------------");
							System.out.println("You have selected Recharge");
							System.out.println("---------------------------");
							
							System.out.print("Enter Sim Number for verification: ");
							String sn1 = sc.next();
							
							Sim s1 = msc.searchSim(sn1);
							
							if(s1 != null)
							{
								System.out.println("*** Sim Verified  ***");
								System.out.println("Sim Holder Name: " + s1.getCustomer().getName());
								
								System.out.println("Current Balance: " + s1.getBalance());
								
								System.out.print("Rcharge : ");
								double am = sc.nextDouble();
								
								if(s1.recharge(am))
								{
									System.out.println("----  Recharge Sucessfull  ----");
									System.out.println("New Balance: " + s1.getBalance());
									frwd.writeInFile(am + " Recharged in " + s1.getSimNumber());
								}
								else
								{
									System.out.println("---  Recharge Failed  ---");
								}								
							}
							else
							{
								System.out.println("***  Invalid Sim, Can NOT Recharge  ***");
							}
							
							break;
							
						case 2:
							
							System.out.println("---------------------------");
							System.out.println("You have selected Balance Transfer");
							System.out.println("---------------------------");
							
							System.out.print("Enter Sim Number for verification: ");
							String from = sc.next();
							System.out.print("Enter Sim Number for verification: ");
							String to = sc.next();
							
							Sim sf = msc.searchSim(from);
							Sim st = msc.searchSim(to);
							
							if(sf != null && st !=null)
							{
								System.out.println("*** Sim Verified  ***");
								System.out.println("Sim Holder Name: " + sf.getCustomer().getName());
								
								System.out.println("Current Balance: " + sf.getBalance());
								
								System.out.print("Balance Transfer : ");
								double am = sc.nextDouble();
								
								if(sf.balanceTransfer(am,st))
								{
									System.out.println("----  Transfer Sucessfull  ----");
									System.out.println("New Balance: " + sf.getBalance());
									frwd.writeInFile(am + " Transferd from " + sf.getSimNumber());
									
								}
								else
								{
									System.out.println("---  Transfer Failed  ---");
								}								
							}
							else
							{
								System.out.println("***  Invalid Sim, Can NOT Transfer ***");
							}
							
							
							break;
							
						case 3:
							
							System.out.println("---------------------------");
							System.out.println("You have selected Transaction History");
							System.out.println("---------------------------");
							
							frwd.readFromFile();
							
							break;
				
							
						case 4:
							
							System.out.println("---------------------------");
							System.out.println("Going Back....");
							System.out.println("---------------------------");
							
							break;
							
						default:
							
							System.out.println("---------------------------");
							System.out.println("You choose an Invalid Option");
							System.out.println("---------------------------");
							
							break;
					}
						
					break;
					
				case 5:
					
					System.out.println("---------------------------");
					System.out.println("You have selected Mobile Sim Company Information");
					System.out.println("---------------------------");
					
					msc.showDetails();
					
					break;
					
				case 6:
					
					System.out.println("---------------------------");
					System.out.println("Thank You For Using Our System");
					System.out.println("---------------------------");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("---------------------------");
					System.out.println("You choose an Invalid Option");
					System.out.println("---------------------------");
					
					break;
					
			}
		}
	}
}
					
				