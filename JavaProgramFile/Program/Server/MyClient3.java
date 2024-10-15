import java.net.*;
import java.io.*;
class MyClient3{
public static void main(String args[]){
try{
Socket s=new Socket("localhost",10);
System.out.println(s);

DataInputStream ds=new DataInputStream(s.getInputStream());

DataOutputStream dd=new DataOutputStream(s.getOutputStream());

dd.writeUTF("hello server kaise ho");

System.out.println((String)ds.readUTF());

}
catch(Exception e){
System.out.println(e);
}
}}