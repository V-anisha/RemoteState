package package1;

public class first {
	public static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=2,c;
		System.out.print(a+"\t"+b+"\t");
		for(int i=1;i<n;i++)
		{
			//a,b,c=a+b
			a=i;
			b=i+1;
			c=a+b;
			System.out.print(c+"\t");
		}
	}
}