 class Test1 {
			 D show () {
				// D b=new D();//
				// System.out.println(b);
				return new D();
				// anomeyous object
			}
			 D getobject() {
				// D b=new D();
				 return new D ();
			 }
			public static void main(String arg []) {
				Test1 t =new Test1 ();
				System.out.println(t.show ());
				System.out.println(t.getobject());
			}
	}
	class D
	{
	D(){
		System.out.println("B constructor....");
	}
	}
	


