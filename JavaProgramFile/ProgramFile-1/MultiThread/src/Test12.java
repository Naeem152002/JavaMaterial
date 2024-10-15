//anymous tarike se hai har 3 second baadchalega
import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;
class Mytask1 extends TimerTask{
	public void run() {//iske andar koi task krwana hai
		Frame f=new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		
	}
}
public class Test12 {

	public static void main(String[] args) {
		
		Timer t=new Timer();
	t.scheduleAtFixedRate(new TimerTask(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
		System.out.println("hi");	
		}
	},3000,3000);		
	
	}

}
