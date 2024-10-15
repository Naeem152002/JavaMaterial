package com.staticnestedclass;

class Test4
{
int x=10;
static int y=20;

static class Inner
{
public static void main(String a[])
{
System.out.println(y);
Inner i=new Inner();
Test4 o=new Test4();//agar aap ko cmd se inner clas ko chalan hain
// to apko Test4$Inner likhana padega aisa isliye
//kiya gaya hain taki inner class java walo ne kiya hain taki
//compiler and jvm samaj sake fark kon si nested han aur konsi 
//consi outer class hain 

System.out.println(o.x);
  
}
}}