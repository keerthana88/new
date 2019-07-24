package com.constr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

 

public class Testing {
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("DataInsert.xml");  
	    BeanFactory factory=new XmlBeanFactory(r); 
	    Product bi=(Product) factory.getBean("product");	
	    bi.Display();
		
	}

}
