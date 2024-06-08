/*to find grade of a student using if else ladder according to the
percentage of marks obtained.*/
package vanishapkg;
import java.util.*;

public class prg2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("input your marks");
		int marks=sc.nextInt();
		if(marks>= 90)
			System.out.println("Grade A");
		else if(marks<90 && marks>=80)
			System.out.println("Grade B");
		else if(80>marks && marks>=70)
			System.out.println("Grade C");
		else if(70>marks && marks>=60)
			System.out.println("Grade D");
		else if(60>marks && marks>=50)
			System.out.println("Grade E");
		else if(50>marks && marks>=40)
			System.out.println("Grade F");
		else if(marks<40)
			System.out.println("FAILED");
		else
		System.out.println("Wrong input");
		sc.close();
	}
}