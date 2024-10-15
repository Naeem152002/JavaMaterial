// ye har 5 second ke main ek task banake dega wo bhi frame:task schudling
import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;
class Mytask extends TimerTask{
	public void run() {//iske andar koi task krwana hai
		Frame f=new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		
	}
}
public class Test11 {

	public static void main(String[] args) {
		
		Timer t=new Timer();
		t.scheduleAtFixedRate(new Mytask(), 5000,5000);
		
		
		// TODO Auto-generated method stub

	}

}
