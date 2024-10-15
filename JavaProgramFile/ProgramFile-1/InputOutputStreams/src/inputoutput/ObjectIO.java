package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream (new File("C:\\Users\\naeem\\OneDrive\\Desktop\\f10.txt")));

Exp e=new Exp("surya",1000,34);
objectOutputStream.writeObject(e);
objectOutputStream.flush();
objectOutputStream.close();
//serilization

ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream(new File("C:\\Users\\naeem\\OneDrive\\Desktop\\f10.txt")));
Exp emp=(Exp)objectInputStream.readObject();
emp.show();
}catch(Exception e) {


}
	}

}
