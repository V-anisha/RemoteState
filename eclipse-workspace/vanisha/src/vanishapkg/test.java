		package vanishapkg;
		import java.util.*;
		
		public class test 
		{
			String str;
			int num;
		
			void read()
			 {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("input a word");
				 str=sc.next();
				 System.out.println("input a number");
				 num=sc.nextInt();
				 sc.close();
			 }
		
			void overloaded()
			{
				System.out.println("1)using this function to show overloading");
			}
			
			void overloaded(int n)
			{
				System.out.println("2) "+ n);
			}
			
			void overloaded(double n1)
			{
				System.out.println("3) +1 value of N1 is "+ n1++);
			}
			
			void powerDigit()
			{
				int sum=0;
				while(num!=0)
				{
				int d=num%10;
				sum=sum+(d*d);
				num=num/10;
				}
				System.out.println("sum is "+sum);
			}
			
			void display()
			{
				int ln=str.length();
				System.out.println("the length is "+ln);
			}
			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
				int n=5;
				double n1=2.0;
				test obj=new test();
				obj.read();
				obj.overloaded();
				obj.overloaded(n);
				obj.overloaded(n1);
				obj.powerDigit();
				obj.display();
			}
		
		}