 // kisi method se object retun krane ho to use kre .kisi ka bhi B,C.ye tharika factory pattern 
class Test {
		 Test show () {
			return new Test();
		}
	B disp() {
		return new B();
	}
	C car() {
		return new C();
	}
	C motor() {
		return new C();
	}
		public static void main(String arg []) {
			Test t =new Test ();
			System.out.println(t);
			C c=new C();
			System.out.println(c);
			System.out.println(t.show ());
			System.out.println(t.disp());
			System.out.println(t.car());
			System.out.println(t.motor());
		}
}
class B{
	
}
class C{
	
}
	
