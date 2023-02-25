import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Market market = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); 	
		
		boolean repeat  = true;
		LocalProduct.perQuantityLimit = 500.0;
		ImportedProduct.perQuantityLimit = 100.0;
		
		System.out.println("************************");
		System.out.println("Welcome to ABC Market");
		System.out.println("************************");
		System.out.println();
		
		while(repeat)
		{
			System.out.println("your choice?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				
					System.out.println("***********************************");
					System.out.println("Your choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search An Employee");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Salary:");
							double salary1 = sc.nextDouble();
							
							Employee e1  = new Employee();
							e1.setName(name1);
							e1.setEmpId(empId1);
							e1.setSalary(salary1);
							
							if(market.insertEmployee(e1))
							{System.out.println("Employee Inserted.... ID: "+e1.getEmpId());}
							else
							{System.out.println("Oops..... Something is Wrong");}
							
							System.out.println();
							
							
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an Existing Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = market.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(market.removeEmployee(e2)){System.out.println("Employee Removed........ ID: "+e2.getEmpId());}
								else{System.out.println("Oops..... Something is Wrong....");}
							}
							else{System.out.println("No Such Employee Found to remove......");}
							
							System.out.println();
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							System.out.println();
							
							market.showAllEmployees();
							System.out.println();
							
							break;
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = market.searchEmployee(empId4);
							
							if(e4 != null)
							{
								System.out.println("Employee Found..............");
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Salary: "+e4.getSalary());
								System.out.println();
							}
							else{System.out.println("No Such Employee Found......");}
							
							System.out.println();
							
							break;
						
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
					
				case 2:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Shop Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove Existing Shop");
					System.out.println("3. Show All Shops");
					System.out.println("4. Search A Shop");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Shop");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
							String sid1 = sc.nextInt();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.nextInt();
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
							
							if(market.insertShop(s1)){System.out.println("Shop Inserted..... SID: "+ s1.getSid());}
							else{System.out.println("Oops..... Something is Wrong...");}
							
							System.out.println();
							break;
						
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Shop");
							System.out.println("***********************************");
							System.out.println();
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							Shop s2 = market.searchShop(sid2);
							
							if(s2 != null)
							{
								if(market.removeShop(s2)){System.out.println("Shop Removed........ ID: "+s2.getSid());}
								else{System.out.println("Oops..... Something is Wrong....");}
							}
							else{System.out.println("No Such Shop Found to remove......");}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Shops");
							System.out.println("***********************************");
							System.out.println();
							
							bank.showAllShops();
							System.out.println();
							break;
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Shop");
							System.out.println("***********************************");
							System.out.println();
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							
							Shop s4 = market.searchShop(sid4);
							
							if(s4 != null)
							{
								System.out.println("Shop Found..............");
								System.out.println("Shop sid: "+s4.getSid());
								System.out.println("Shop name: "+s4.getName());
								
								System.out.println();
							}
							else{System.out.println("No Such Shop Found......");}
							
							System.out.println();
							
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
					
				case 3:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Shop Product Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Product for a Shop");
					System.out.println("2. Remove Existing Product of a Shop");
					System.out.println("3. Show All Products of a Shop");
					System.out.println("4. Search a Product for a Shop");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Product for a Shop");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.println("There are two types of Product: ");
							System.out.println("1. LocalProduct");
							System.out.println("2. ImportedProduct");
							System.out.println("3. Go Back");
							
							System.out.print("Enter your Type: ");
							int type = sc.nextInt();
							
							Product p = null; 
							
							if(type == 1)
							{
								System.out.println("Your Type is: LocalProduct");
								
								System.out.print("Enter Product ID: ");
								String pid = sc.next();
								System.out.print("Enter Product name: ");
								String name = sc.next();
								System.out.print("Enter Product availableQuantity: ");
								int availableQuantity = sc.nextInt();
								System.out.print("Enter Product price: ");
								double price = sc.nextDouble();
								System.out.print(" Enter Product DiscountRate: ");
								double dr = sc.nextDouble();
								
								LocalProduct lp = new LocalProduct(pid, name, availableQuantity, price, dr);
								
								p = lp;
									
							}
							else if(type == 2)
							{
								System.out.println("Your Type is: ImportedProduct");
								
								System.out.print("Enter Product ID: ");
								String pid = sc.next();
								System.out.print("Enter Product name: ");
								String name = sc.next();
								System.out.print("Enter Product availableQuantity: ");
								int availableQuantity = sc.nextInt();
								System.out.print("Enter Product price: ");
								double price = sc.nextDouble();
								System.out.print("Enter Product CountryName: ");
								String cn = sc.next();
								
								ImportedProduct ip = new ImportedProduct(pid, name, availableQuantity, price,cn);
								
								p = ip;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.................");
							}
							else
							{
								System.out.println("Invalid Type......");
							}
							
							if(a != null)
							{
								System.out.print("Enter Shop sid: ");
								String sid = sc.next();
								
								Shop s  = bank.searchShop(sidd);
								
								if(s != null)
								{
									if(s.insertProduct(p)){System.out.println("Product Inserted.... Product Name: "+p.getName());}
									else{System.out.println("Product Not inserted");}
								}
								else{System.out.println("Oops... Something is Wrong.....");}
							}
							
							System.out.println();
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove a Existing product of a shop");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Products of Shop");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Shop");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
							String sid4 = sc.next();
								
							Shop s4 = market.searchShop(sid4);
							
							if(s4 != null){s4.showAllProducts();}
							else{System.out.println("Oops.... Something is Worng....");}
							
							System.out.println();
							
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					
					System.out.println();
					break;
					
				case 4:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Product Quantity Add-Sell");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add Product");
					System.out.println("2. Sell Product");
					System.out.println("3. Show Add-Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Add Product");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
						     String sid1 = sc.next();
							
							Shop s1 = market.searchCustomer(nid1);
							
							if(s1 != null)
							{
								System.out.print("Enter Product name: ");
								String name = sc.next();
								
							  Product p = s1.searchProduct(availableQuantity);
								
								if(p != null)
								{
									System.out.println("Current Price: "+p.getPrice());
									System.out.print("Enter Add Product: ");
									int availableQuantity = sc.nextInt();
									
									if(p.Add Product(availableQuantity))
									{
										System.out.println("New Price: "+p.getPrice());
										frwd.writeInFile(availableQuantity + " ADD PRODUCT "+ p.getName());
									}
									else{System.out.println("Oops... Something is Worng...");}
								}
								else{System.out.println("Oops... Something is Worng...");}
							}
							else{System.out.println("Oops... Something is Worng...");}
							
							System.out.println();
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Sell Product");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
							String sid2 = sc.next();
							
							Shop s2 = market.searchShop(sid2);
							
							if(s2 != null)
							{
								System.out.print("Enter Product Name: ");
								String name = sc.next();
								
								Product p = s2.searchProduct(availableQuantity);
								
								if(p != null)
								{
									System.out.println("Current price: "+p.getPrice());
									System.out.print("Enter Sell Product: ");
									int availableQuantity = sc.nextInt();
									
									if(p.SellProduct(availableQuantity))
									{
										System.out.println("New price: "+p.getPrice());
										frwd.writeInFile(availableQuantity + " SELL PRODUCT"+ p.getName());
									}
									else{System.out.println("Oops... Something is Worng...");}
								}
								else{System.out.println("Oops... Something is Worng...");}
							}
							else{System.out.println("Oops... Something is Worng...");}
							
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show Add-Sell History");
							System.out.println("***********************************");
							System.out.println();
							
							frwd.readFromFile();
							
							break;
					
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					
					System.out.println();
					break;
				
				case 5:
				
					repeat = false;
					System.out.println("***********************************");
					System.out.println("Thank you for using our system");
					System.out.println("***********************************");
					
					System.out.println();
					break;
					
				default:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is Invalid");
					System.out.println("***********************************");
					System.out.println();
					break;			
			}	
		}
	}
}