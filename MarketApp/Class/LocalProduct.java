package classes;

import java.lang.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
	public LocalProduct()
	{
		super();
		System.out.println("F-SA");
	}
	public (String pid, String name, int availableQuantity, double price, double discountRateRate)
	{
		super(pid,name,availableQuantity,price);
		
		this.discountRate = discountRate;
		System.out.println("P-SA");
	}
	
	public void setDiscountRate(double discountRate){this.discountRate = discountRate;}
	public double getDiscountRate(){return discountRate;}
	
	public void showDetails()
	{
		System.out.println("P I D: "+ pid);
		System.out.println("Name: "+ name);
		System.out.println("Available Quantity: "+ availableQuantity);
		System.out.println("Price: "+ price);
		System.out.println("Per Quantity Limit: "+ perQuantityLimit);
		System.out.println("Discount Rate: "+ discountRateRate);
	}
}