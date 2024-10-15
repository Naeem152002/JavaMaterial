package abs;
	abstract class Message{
	    abstract void wish();
	}
	class Ratan extends Message {
	    void wish(){
	        System.out.println("Good Morning");
	    }
	}
	class Anu extends Message {
	    void wish(){
	        System.out.println("Good evening");
	    }
	}
	class Demo3 {
	public static void main(String[] args) {
	 //Message m=new Message(); error:message is absrtact ;cannot be instantiated
	 /*Ratan r=new Ratan();
	 r.wish();
	 Anu a=new Anu ();
	 a.wish(); 
	 Message m1=new Ratan ();
	 m1.wish();
	 Message m2=new Anu();
	 m2.wish(); */try {
				Class c=Class.forName(args[0]);
				Message m=(Message)c.newInstance();
				m.wish();
			}
		catch (Exception e) {
			e.printStackTrace();
	}
	}}

