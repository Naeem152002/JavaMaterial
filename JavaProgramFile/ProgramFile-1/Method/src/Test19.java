// forward refershing 
public class Test19 {
    int x=10;
    
  


	{disp();
		y=29;
		System.out.println(this.y);
	}
	int y;
	
	static  void  disp() {
			System.out.println("disp.."); 
		}
	void show() {
		int x=20;
		System.out.println(x);
		//disp();
		//this.disp();
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Test19 t=new Test19();
t.show();
		}
	}
