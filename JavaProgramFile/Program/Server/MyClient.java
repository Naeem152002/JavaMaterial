import java.net.*;
import java.io.*;
class MyClient{
public static void main(String args[]){
try{
Socket s=new Socket("localhost",10);
System.out.println(s);
}
catch(Exception e){
System.out.println(e);
}
}}