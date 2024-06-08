package package_interface;
import java.io.FileOutputStream;
public class file1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Prakhar\\Desktop\\BCA\\3 SEM\\java lab\\file1.txt");
		String s="Vanisha Gupta";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("successfully Written, please check");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}