package com.strings;

public class Test1 {
	public static double shortestPath(String str) {
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
			char dir=str.charAt(i);
			if(dir=='E') {
				x++;
			}else if(dir=='W') {
				x--;
			}else if(dir=='N') {
				y++;
			}else {
				y--;
			}
		}
		double X2=x*x;
		double Y2=y*y;
		double path=Math.sqrt(X2+Y2);
		return path;
	}
	
	public static void main(String[]args) {
		String s="WNEENESENNN";
		System.out.println(shortestPath(s));
	}

}
