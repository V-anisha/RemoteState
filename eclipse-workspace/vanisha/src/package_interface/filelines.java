package package_interface;
import java.io.File;

public class filelines 
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Prakhar\\Desktop\\BCA\\3 SEM\\java lab\\file1.txt");
		System.out.println("length of file...."+ f.length());
	}
}