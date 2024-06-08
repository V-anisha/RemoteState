package lab13;
import java.lang.Thread;
class fibo implements Runnable{
	public void run() 
	{
		int first=0,second =1,n=10;
		System.out.println("Fibonacci Series");
		System.out.println(first+","+second+",");
		
		for(int i=1;i<=n;i++)
		{
			int nextterm=first+second;
			first=second;
			second=nextterm;
		}
	}
}
class area implements Runnable{
	public void run() {
		int r=5;
		double pi=3.142,area=0.0;
		area=pi*r*r;
		System.out.println("area of circle is"+area);
	}
}
public class lab13 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new fibo());
		Thread t2 = new Thread(new area());
		t1.start();
		t2.start();
	}
}