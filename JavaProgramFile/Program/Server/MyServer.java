import java.net.*;
import java.io.*;
class MyServer{
public static void main(String args[]){
try{
ServerSocket s=new ServerSocket(10);
System.out.println("server has started and waiting for client request...");
Socket sk=s.accept();
System.out.println(sk);
}
catch(Exception e){
System.out.println(e);
}
}}