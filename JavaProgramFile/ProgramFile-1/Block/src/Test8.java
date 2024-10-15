// proof kro object ki refence id ka sara code object class ke to string method mai likha hota 
public class Test8 {
	
	public String toString () {
		return getClass ().getName()+"s"+Integer.toHexString(hashCode());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Test8 t=new Test8();
		System.out.println(t);
 String s=new String ("hello");
 System.out.println(s);
	}

}
