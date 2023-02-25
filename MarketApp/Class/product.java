package classes;

import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
	protected String pid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	public static double perQuantityLimit;
	
	public Product()
	{
		System.out.println("f-a");
	}
	public Product(String pid, String name, int availableQuantity, double price)
	{
		this.pid = pid;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price=price;
		System.out.println("p-a");
	}
	
	public static void setPerQuantityLimit(double pql)
	{
		perQuantityLimit = pql;
	}
	public static double getPerQuantityLimit()
	{return perQuantityLimit;}
	
	public void setPid(String pid)
	{this.pid = pid;}
	public void setName(String name)
	{this.name = name;}
	public void setAvailableQuantity(int availableQuantity)
	{this.availableQuantity= availableQuantity;}
	public void setPrice( double price)
	{ this.price=price;}
	
	public String getPid(){return pid;}
	public String getName(){return name;}
	public int getAvailableQuantity() { return availableQuantity;}
	public double getPrice(){return price;}
	
	public boolean addQuantity(int amount)
	{
		if(amount>0 && amount<=perQuantityLimit)
		{
			price = price + amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=perQuantityLimit && amount<=price)
		{
			price = price - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract void showInfo();
}