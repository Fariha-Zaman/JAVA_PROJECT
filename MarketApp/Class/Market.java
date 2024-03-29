package classes;

import java.lang.*;
import interfaces.*;

public class Market implements ShopOperations, EmployeeOperations
{
	Shop shops[] = new Shop[100];
	Employee employees[] = new Employee[10];
	
	public boolean insertShop(Shop s)
	{
		boolean flag = false;
		
		for(int i = 0; i<shops.length; i++)
		{
			if(shops[i] == null)
			{
				shops[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeShop(Shop s)
	{
		boolean flag = false;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == s)
			{
				shops[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllShops()
	{
		System.out.println("**********************************");
		
	
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				System.out.println("------------------------");
				customers[i].showAllShops();
				System.out.println();
			}
		}
	}
	
	public Shop searchShop(String sid)
	{
		Shop s = null;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				if (shops[i].getSid()== sid)
				{
					s = shops[i];
					break;
				}
			}
		}
		return s;
	}
	
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		
		for(int i = 0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllEmployees()
	{
		System.out.println("**********************************");
		
	
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("------------------------");
				System.out.println("Enployee Id: "+ employees[i].getEmpId());
				System.out.println("Enployee Name: "+ employees[i].getName());
				System.out.println("Enployee Salary: "+ employees[i].getSalary());
				System.out.println();
			}
		}
	}
	
	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
}