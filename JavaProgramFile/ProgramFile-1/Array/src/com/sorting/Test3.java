package com.sorting;

public class Test3 {
	
	public static void main(String[]args) {
		int a[]= {4,2,5,7,6,89};
		for(int i=0;i<a.length-1;i++) {
			int biggest=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[biggest]<a[j]) {
					biggest=j;
				}
			}
			int temp=a[biggest];
			a[biggest]=a[i];
			a[i]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
	}

}
}