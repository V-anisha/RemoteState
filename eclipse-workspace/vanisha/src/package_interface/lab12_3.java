package package_interface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class lab12_3 
{
	public static void main(String[] args)throws IOException 
	{
		 	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Prakhar\\Desktop\\BCA\\3 SEM\\java lab\\marks.txt"));
	        int totalMark = 0;
	        String line;
	        while ((line = br.readLine()) != null) 
	        {
	            String[] marks = line.split(",");
	            for (String mark : marks) 
	            {
	                totalMark += Integer.parseInt(mark);
	            }
	        }
	        br.close();
	        System.out.println("Total mark: " + totalMark);
	}
}