package com.constr;

 import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

 
public class Product {
	private String productName;
	private int ID;
	private Map<String,Integer> price;
	public Product(String productName, int ID, Map<String, Integer> price) {
		 
		this.productName = productName;
		this.ID = ID;
		this.price = price;
	}
	public void Display()
	{
		System.out.println(productName+" "+ID);
		System.out.println("parts details");
		 	
	   Set<Entry<String, Integer>> set=price.entrySet();  
	    Iterator<Entry<String,Integer>> itr=set.iterator(); 
	    while(itr.hasNext())
	    {
	    	Entry<String,Integer> entry=itr.next();
	    	System.out.println(" Bikeparts:"+entry.getKey()+"  " + " price of respective parts:"+entry.getValue());
	    }


	}
	

}
