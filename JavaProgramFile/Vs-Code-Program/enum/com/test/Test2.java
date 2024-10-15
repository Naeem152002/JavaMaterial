package com.test;

import static com.days.Days.*;

import  com.days.Days;

public class Test2 {
    
    public static void main(String args[]){

        Days day=Days.SATURDAY;
        System.out.println(day);
        System.out.println(FRIDAY);

        switch (day) {
            case SUNDAY:
                System.out.println("sunday are holiday");
                break;
         case MONDAY:
                System.out.println("monday are office day");
                break;
         case TUESDAY:
                System.out.println("tuse day");
                break;
         default:
                System.out.println("default are holiday");
    
        }

    }


}
