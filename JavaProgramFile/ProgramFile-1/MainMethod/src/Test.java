/* main method main string type ka arguments isliye jata hain taki runtime per app arguments bhej pao
 * command line se run time per value pass krana command line arguments kahalata hain.
 * main method na to userdefined hain kyki user use defind nahi kr raha hain nahi ise change kr  sakta hain
 * aur nahi predefind hain kyuki ise defind humin krate but usme kuch change nahi kr sakate hain.ye contract 
 * java language kahati hain jab bhi aap java program banaye to main method likhe
 * 
 */ 
// hum jisko chahe usko call kr sakate hain cmd per 
//main method ko khud call kr le to proof ho jayega ki ye predefind nahi hain
class A{
	public static void main(String[]kkk) {
		System.out.println("main A");
	}
}
 class Test {
	public static void main(String args[]) {
		String s[]={"hi"};
		A.main(s);
		
		A.main(args);
		
		//kisi bhi array ya reference type ke data ka value null hota hain
		A.main(null);
		
		System.out.println("main Test");
	}

}
