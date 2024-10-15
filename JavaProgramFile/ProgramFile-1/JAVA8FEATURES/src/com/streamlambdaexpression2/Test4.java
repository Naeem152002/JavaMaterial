package com.streamlambdaexpression2;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	
	public static void main(String args[]) {
		
		List<Product>products=new ArrayList<>();
		
		products.add(new Product(1,"Hplaptop",30000));
		products.add(new Product(1,"Hplaptop",30000));
		products.add(new Product(2,"dell",40000));
		products.add(new Product(3,"lenvoe",50000));
		
		
		products.stream().filter(t->t.getPrice()>30000).forEach(System.out::println);
		
		
		
		
	}

	

}
