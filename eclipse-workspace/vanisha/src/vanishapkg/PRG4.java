package vanishapkg;

import java.util.Scanner;
import java.lang.Math;

public class PRG4 {
	Scanner sc= new Scanner(System.in);
	System.out.println("1-rock 2-paper 3-Scissors");
	System.out.println("input your choice");
	int p1=sc.nextInt();
	int p2= Math.random();
	switch(p1)
	{
	case 1:
		{
			switch(p2)
			{
			case 1: System.out.println("TIE");
			 break;
			case 2: System.out.println("ROCK WINS");
			break;
			case 3: System.out.println("ROCK WINS");
			break;
			}
		}
		break;
		
		case 2:
		{
			switch(p2)
			{
			case 1: System.out.println("PAPER WINS");
			 break;
			case 2: System.out.println("TIE");
			break;
			case 3: System.out.println("SCISSORS WINS");
			break;
			}
		}
		break;
	
		case 3:
		{
			switch(p2)
			{
			case 1: System.out.println("ROCK WINS");
			 break;
			case 2: System.out.println("SCISSORS WINS");
			break;
			case 3: System.out.println("TIE");
			break;
			}
		}
		break;
}
}
