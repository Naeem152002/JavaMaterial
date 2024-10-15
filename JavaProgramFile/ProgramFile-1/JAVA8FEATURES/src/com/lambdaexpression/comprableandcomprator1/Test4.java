package com.lambdaexpression.comprableandcomprator1;

import java.util.*;  
public class Test4{  
public static void main(String args[]){  
List<Student> student=new ArrayList<Student>();  
student.add(new Student(101,"Vijay",23));  
student.add(new Student(106,"Ajay",27));  
student.add(new Student(105,"Jai",21));  
  
Collections.sort( student);//yaha per jo class hain extend krna jaroori hain comprable interface ko 
//sort ke constructor main 
student.forEach((x)->System.out.println(x)); 
}  
}  
 
