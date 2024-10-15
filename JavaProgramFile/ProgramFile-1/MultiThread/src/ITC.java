class Banking{
	int amount;
	synchronized void withdraw(int amount) throws InterruptedException {
		
		System.out.println("Thread is going to withdraw................");
		if(this.amount<amount) {
			System.out.println("insufficient balance ....... wait for diposit");
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			this.amount=amount;
			System.out.println("withdraw done...."+amount);
			notify();
		}
	   
synchronized public void submit(int amount) {
	System.out.println("now amount is going to submit.....");
	this.amount=amount;
	System.out.println("submit done...."+amount);
}
}
public class ITC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Banking b=new Banking();
new Thread()
{
	public void run() {
	b.submit(10000);	
	}
	
}.start();



new Thread()
{
	public void run() {
	try {
		b.withdraw(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
}.start();
	}



	}

