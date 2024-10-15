/* static -kyuki ye class ke behaviour ko  reprenste kr raha hain aur ye bhi reprsent kr rah hain isko call krne
 * ke liye koi object ki jaroot nahi hain to isliye main method static banayag gaya hain ki jab bhi jvm iske 
 * call kre to isko class ke name se call kr le .void isliye banaya gaya hain taki koi valuel return na kre
 * aur main to method ka naam hain aur public isliye banaya gaya hain koi bhi ise call kr le . ye entery point
 * hota hain jo jvm ise call krta hain. object banata to memory west ho jati 
 * isme String type ka array kyu jata hain taki command line arguments bhej pao aap program run kro java B h */
class B{
	public static void main(String... aa) {//variable length arguments ye jdk 1.5 main VAR_ARGS
		System.out.println("main B");
	}
}
 class Test1 {
	public static void main(String args[]) {
		
		B.main();
		
		System.out.println("main Test1");
	}

}
