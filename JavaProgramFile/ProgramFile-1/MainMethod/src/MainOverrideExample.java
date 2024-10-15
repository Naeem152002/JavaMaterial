class ABC{
	 // Overridden main method (non-static)
    public void main(String[] args) {
        System.out.println("This is the overridden main method.");
    }
}
class BCD extends ABC{
	public void main(String[] args) {
        System.out.println("JVM called this main method.");
        
    }
}

public class MainOverrideExample{
   public static void main(String[]args) {
	   BCD b=new BCD();
	   b.main(args);
    }
}
