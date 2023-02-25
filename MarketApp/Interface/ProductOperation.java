package interfaces;

import java.lang.*;
import classes.*;

public interface ProductOperations
{
	boolean insertProduct(Product p);
	boolean removeProduct(Product p);
	void showAllProducts();
	Account searchProduct(String pid);
}