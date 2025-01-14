package com.arrays;

public class Test3 {
	//Tx=n/2=logn
	public static int binarySearch(int a[],int key) {//sorted array apply
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(a[mid]==key) {
				return mid;
			}
			if(a[mid]<key) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return -1;
	}

	public static void main(String[]args) {
		int a[]= {2,3,5,10,25,35};
		int key=75;
		System.out.println(binarySearch(a, key));
		
	}
	}

