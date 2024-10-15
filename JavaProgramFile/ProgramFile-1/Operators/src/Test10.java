
public class Test10 {
public static void main(String argg[]) {
if (10>20) {
	System.out.println("anu");
}
else {
	System.out.println("ratan");
}
String str= 10>20?"ratan":"anu";
System.out.println(str);
int res = 10<20 && 30>20?100:200;
System.out.println(res);
// unicode conversion
int x = 10<20?'a':20;
System.out.println(x);

char ch=10<20?98:'c';
System.out.println(ch);
// error
// 10<n?"return":100;not a statement
}
}
