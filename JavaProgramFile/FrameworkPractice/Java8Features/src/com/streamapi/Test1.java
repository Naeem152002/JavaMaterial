package com.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Test1 {
	
	public static void main(String[]args) {
		List<Product>productList=new ArrayList<Product>();
		productList.add(new Product(1,"Ashok",5600f));
		productList.add(new Product(2,"Ashok",7800f));
		productList.add(new Product(1,"Ashok",8600f));
		productList.add(new Product(1,"Ashok",3600f));
		
		List<Float>priceList=new ArrayList<Float>();
		
		for(Product product:productList) {
			if(product.price>4000) {
				priceList.add(product.price);
			}
		}
		System.out.println(priceList);
		
	}

}
