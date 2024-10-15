// StringTokenizer;
import java.util.StringTokenizer;
public class Test13 {
public static void main(String srg[]) {
	//StringTokenizer shStringTokenizer =new StringTokenizer("hello how are you ");
	StringTokenizer shStringTokenizer =new StringTokenizer("hello how are you ","h");
	while (shStringTokenizer.hasMoreTokens()) {
		System.out.println(shStringTokenizer.nextToken());
	}
}
	

}
