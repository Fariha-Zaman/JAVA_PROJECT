package classes;

import java.lang.*;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public ImportedProduct()
	{
		super();
		System.out.println("F-FA");
	}
	public ImportedProduct(String pid, String name, int availableQuantity, double price, String countryName)
	{
		super(pid,name,availableQuantity,price);
		
		this.countryName = countryName;
		System.out.println("P-FA");
	}
	
	public void setCountryName(String countryName){this.countryName = countryName;}
	public int getCountryName(){return countryName;}
	
	public void showDetails()
	{
	    System.out.println("P I D: "+ pid);
		System.out.println("Name: "+ name);
		System.out.println("Available Quantity: "+ availableQuantity);
		System.out.println("Price: "+ price);
		System.out.println("Per Quantity Limit: "+ perQuantityLimit);
		System.out.println("Country Name: "+ countryName);
	}
}