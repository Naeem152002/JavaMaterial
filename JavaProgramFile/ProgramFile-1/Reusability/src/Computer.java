// aggregation karna ho to use kre jo cheez ka hona jaroori hain uske liye constructor bana le aur week part 
// ke liye method bana le .
class HardDisk {
	 HardDisk(){
		 System.out.println("hard disk is strong");
	 }
 }
 class Ram{
	 Ram(){
		 System.out.println("ram disk is strong");
	 }
 }
 class Speaker{
	 void sp() {
		 System.out.println("speaker is wekkkk");
	 }
 }
 class Monitor {
	 void mv () {
		 System.out.println("monitor is weekkk");
	 }
 }
	 public class Computer {
			 HardDisk hardDisk;//agrgation ho gaya ya per
			 Ram ram;
			 Speaker speaker;
			 Monitor monitor;
			 Computer (){
				 monitor =new Monitor();
				 hardDisk =new HardDisk();
			 speaker =new Speaker ();
				 ram =new Ram();
			 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer c=new Computer ();
c.speaker.sp();
c.monitor.mv();
	 }}
