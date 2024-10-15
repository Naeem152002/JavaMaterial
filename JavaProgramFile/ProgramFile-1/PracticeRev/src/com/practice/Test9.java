package com.practice;

public class Test9 
    {
    public static void main (String[] args) {
        {         
        int number = 9;
       
        // 2 bit signed right shift
        int Ans = number >>>2;
       
        System.out.println(Ans); 
        
        int y = 4;
        System.out.println(y >> 1);
        
        // The value of 'x>>>31' is 00...0001
        int x=-1;
        System.out.println(x >>> 31);
    }
}
        
}