package com.sorting;

public class Test1 {
	public static void main(String[]args) {
		int a[]= {4,2,5,7,6,89};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {	
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
	}}
		for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
}}