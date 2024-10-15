// final value dataMember 
public class Test9 {
 final int x ;// blank final : jab ise app final banaoge to iski default value blank ho jayegi  .kyuki agar 
 //iski value daefult hi rahati to app koi value assign nahi kar pate blank banane per app ek bar assign kr sakoge
Test9(){
	x=10;
	System.out.println(x);
}

public static void main(String args [] ){
	//System.out.println(new Test9().x);
	new Test9();
}
}

