package com.demo;

public enum Demo {
MARUTI(100),
HONDA,TESLA//public static fina Demo MARUTI=new Demo

;
Demo(){

}
Demo(int i){

}
public static void main(String[] args) {
    System.out.println("hello");
     System.out.println(MARUTI);

    Demo [] d= Demo.values();
    for(Demo D:d){
        System.out.println(D);
        System.out.println(D.ordinal());
    }
}
   
}
