package inf;
interface III1{
	void m1(); 
	
}
interface III2 extends III1{
	void m2();
}
public interface III extends III1,III2 {// multiple interface
			int x=10;
			void method();
			void disp();
			}




