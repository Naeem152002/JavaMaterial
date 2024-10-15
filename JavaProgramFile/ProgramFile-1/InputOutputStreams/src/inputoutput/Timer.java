package inputoutput;//Timer FileDemo3 se connect hai

public class Timer {
	static long endTime,startTime;
	public static void endTime() {
		endTime=System.nanoTime();
		System.out.println("Total Time"+(endTime-startTime));
	}
	public static void startTime() {
		startTime=System.nanoTime();
	}

}
