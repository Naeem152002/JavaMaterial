import java.net.*;
import java.io.*;
class MyServer3{
public static void main(String args[]){
try{
ServerSocket s=new ServerSocket(10);
System.out.println("server has started and waiting for client request...");
Socket sk=s.accept();
System.out.println(sk);

DataInputStream ds=new DataInputStream(sk.getInputStream());

DataOutputStream de=new DataOutputStream(sk.getOutputStream());

de.writeUTF("Mai to thik");

System.out.println((String)ds.readUTF());
}
catch(Exception e){
System.out.println(e);
}
}}