package com.javatpoint.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService	{
	
	@Override
	public List<Product> findAll() {
		
		// creating an object of ArrayList
		ArrayList<Product> products = new ArrayList<Product>();
				
		// adding product to the List
				
		products.add(new Product(100, "Mobile", "CLK89123", 9000.00, 6));
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));
		products.add(new Product(102, "Washing Machine", "12345L8", 9000.00, 7));
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));
		products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));
		products.add(new Product(105, "Refridgerator", "12WP9087", 10000.00, 4));
		
		//returns products
		
		return products;
		
	}

}
