package package2;
import package1.first;
import java.util.*;
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input the limit of the series");
		first.n=sc.nextInt();
		first.main(args);
		sc.close();
	}
}