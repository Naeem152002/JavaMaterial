/* java ke andar har thread ka apna ek theread group hota hai first wala main thread group hai second wala mai
 * second wala thread hai aur 5 dafault pariorty hoti hai*/
public class Test1 {
static {
	Thread t=Thread.currentThread();
	System.out.println(t);
}
public static void main(String arsg[]) {
	Thread t=Thread.currentThread();
	System.out.println(t);
	
	
	}

}
/* main-thread group
 * main-thread
 * loading- static block
 * main method*/
 