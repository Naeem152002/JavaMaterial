//this keyword ki wajah se  ek anonymous object teeno ko cal kr sakate ho . 
//method  channing 
public class Test15 {
			 Test15 show() {
				System.out.println("show ");
				return this;
			}
			 Test15 disp() {
				System.out.println("disp");
				return this ;
			}
	void Info() {
		System.out.println("info ...");
		
	}
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		new Test15().show().disp().Info();

			}
	 }
