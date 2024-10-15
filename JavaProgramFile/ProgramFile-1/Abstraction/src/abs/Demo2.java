package abs;
 abstract class  Pen{
	 abstract void write ();
	 abstract void refill ();
}
 class Red extends Pen{

	@Override
	void write() {
		System.out.println("write of Red");
		
	}

	@Override
	void refill() {
		System.out.println("refil of Red");
		
	}
	 
 }
 class White extends Pen{

	@Override
	void write() {
		System.out.println("write of White ");
		
	}

	@Override
	void refill() {
		System.out.println("refill of white ");
		
	}
	 
 }


public class Demo2 {
public static void main(String args []) {
	/* Pen t=new Red();
	 t.write();
	 t.refill();
	 Pen t1=new White ();
	 t1.write();
	 t1.refill();*/
	try {
		Class c=Class.forName(args[0]);
		Pen pen=(Pen)c.newInstance();
		pen.write();
		pen.refill();
	}
catch (Exception e) {
	e.printStackTrace();
}
}
}



