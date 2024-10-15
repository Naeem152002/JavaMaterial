//Case2: override throws keyword second case
package ecp;
import java.io.IOException;
class B{
	void show() throws IOException{
		
	}
}
public class Test21 extends B {
	//void show() throws Exception{ ye  exception ka  parent hai wala valid nahi hai 
	void show() throws IOException {// child lagao ye na lagao agar parent main exception ho tab.lekin jo exception
		// uska parent nahi so kara sakat
		
	}
public static void main(String ags[]) {
	
}
}

