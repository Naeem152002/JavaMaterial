package com.sorting;

public class Test12 {
	/*
	 * binary search-prequstice sorted per work krte hain
	 */
	public static int binarySearch(int a[],int key) {
		int start=0;
		int end=a.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(a[mid]==key) {
				return mid;
			}
			
			if(a[mid]<key) {//right
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[]args) {
		int a[]= {2,4,6,8,10,12,14};
		int key=10;
		System.out.println("index is="+binarySearch(a,key));
		
		
	}

}
