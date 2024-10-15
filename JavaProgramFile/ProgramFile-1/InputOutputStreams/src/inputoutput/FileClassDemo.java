package inputoutput;

import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		File file =new File("C:\\Users\\naeem\\OneDrive\\Desktop\\Iopractice\\io.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.lastModified());
		System.out.println(file.exists());
		File file1=new File("C:\\Users\\naeem\\OneDrive\\Desktop\\Iopractice\\io.txt");
		// TODO Auto-generated method stub
		{
		if(file1.exists())
		{
			file1.mkdir();
		}
		else {
			System.out.println("file existtt");
		}
		String ss[]=file.list();
		for(String s:ss)
			System.out.println(s);
	}

}
}