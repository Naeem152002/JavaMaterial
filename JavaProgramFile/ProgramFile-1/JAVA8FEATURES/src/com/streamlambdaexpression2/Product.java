package com.streamlambdaexpression2;


public class Product{
private int id;
private String pname;
private double price;
public Product() {
	
}
public Product(int id, String pname, double price) {
	super();
	this.id = id;
	this.pname = pname;
	this.price = price;
}
@Override
public String toString() {
	return "Test4 [id=" + id + ", pname=" + pname + ", price=" + price + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
