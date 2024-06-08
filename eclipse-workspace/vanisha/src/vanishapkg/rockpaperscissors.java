package vanishapkg;
import java.util.Random;
import java.util.Scanner;
class rockpaperscissors 
{
public static void main(String args[])
{
		Scanner sc= new Scanner(System.in);
		Random rc=new Random();
		System.out.println("1-Rock 2-Paper 3-Scissors");
		System.out.println("Input your choice");
		int p1=sc.nextInt();
		int p2=rc.nextInt(3)+1;
		/*if(p2==0)
		{
			p2++;
		}*/
			
		if(p1<1&&p1>3)
		{
			System.out.println("Wrong input");
			return;
		}
			
		System.out.println("Player 1 plays "+p1);
		System.out.println("Player 2 plays "+p2);
		switch(p1)
		{
		case 1:
			{
				switch(p2)
				{
				case 1: System.out.println("TIE");
				 break;
				case 2: System.out.println("PAPER WINS");
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
		sc.close();
	}
}
