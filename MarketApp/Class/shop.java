package classes;

import java.lang.*;
import interfaces.*;

public class Shop implements ProductOperations 
{
	private String sid;
	private String name;
	private Product listOfProducts[];
	
	public Shop()
	{
		System.out.println("F-Shop");
		this.listOfShops = new Shop[10];
	}
	public Shop(String sid, String name, int sizeOfArray)
	{
		this.sid = sid;
		this.name = name;
		this.listOfProducts= new Product[sizeOfArray];
		System.out.println("P-Shop");
	}
	
	public void setSid(String sid){this.sid = sid;}
	public void setName(String name) {this.name=name;}


	public String getSid(){return sid;}
	public String getName(){return name;}

	
	public boolean insertProduct(Product p)
	{
		boolean flag = false;
		
		for(int i = 0; i<listOfProducts.length; i++)
		{
			if(listOfProducts[i] == null)
			{
				listOfProducts[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeProduct(Product p)
	{
		boolean flag = false;
		
		for(int i=0; i<listOfProducts.length; i++)
		{
			if(listOfProducts[i] == p)
			{
				listOfProducts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllProducts()
	{
		System.out.println("**********************************");
		System.out.println("Shop SID: "+ sid);
		System.out.println("Shop Name: "+ name);
		
	
		for(int i=0; i<listOfProducts.length; i++)
		{
			if(listOfProducts[i] != null)
			{
				System.out.println("------------------------");
				listOfProducts[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public Product searchProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<listOfProducts.length; i++)
		{
			if(listOfProducts[i] != null)
			{
				if(listOfProducts[i].getPid().equals(pid))
				{
					p = listOfProducts[i];
					break;
				}
			}
		}
		return p;
	}
}
