package abs;
abstract class Operations{
        abstract void add(int a,int b);
        abstract void mul(int a,int b);
        }
    abstract class Dev1 extends Operations {
            void add(int a,int b){
                System.out.println(a+b);
            }
          class Dev2 extends Dev1 {

			@Override
			void add(int a, int b) {
				// TODO Auto-generated method stub
				
			}

			@Override
			void mul(int a, int b) {
				// TODO Auto-generated method stub
				
			}
    }
    class Demo4 {
    	public static void main (String args[]) {
    		
    	}
    	}
    }