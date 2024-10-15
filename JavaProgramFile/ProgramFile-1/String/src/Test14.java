import java.util.StringTokenizer;

public class Test14 {
	
	public static void main(String[]args) {
		StringTokenizer s= new StringTokenizer("how are you","y");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
