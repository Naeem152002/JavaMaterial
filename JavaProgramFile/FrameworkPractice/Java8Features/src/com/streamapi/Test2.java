package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}


public class Test2 {
	
	public static void main(String[]args) {
		List<Product1>productList1=new ArrayList<Product1>();
		productList1.add(new Product1(1,"Ashok",5600f));
		productList1.add(new Product1(2,"Ashok",7800f));
		productList1.add(new Product1(1,"Ashok",8600f));
		productList1.add(new Product1(1,"Ashok",3600f));
		
		List<Float>priceList1=productList1.stream().filter(p->p.price>3000).map(p->p.price).collect(Collectors.toList());
		System.out.println(priceList1);
	}
		
	}
	
	


