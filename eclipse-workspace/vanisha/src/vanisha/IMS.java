package vanisha;
import java.util.*;
import java.util.Scanner;
public class IMS
{
	String product;
	int q,ch,price,index;
	IMS()
	{
		product="";
		q=0;
		ch=0;
		price=0;
		index=0;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inventory Management System\n 1.Add product\n 2.Display Inventory\n 3.Search for product\n 4.Exit\n");
		IMS obj=new IMS();
		System.out.println("Input your choice");
		int ch=sc.nextInt();
		while(true)
		{
			if(ch==1)
				obj.addProduct();
			else if(ch==2)
				obj.displayinventory();
			else if(ch==3)
				obj.searchproduct();
			else
				break;
		}
			
	}
		void addProduct()
		{
			int product[] = null;
			int q[] = null;
			int price[] = null;
			Scanner sc=new Scanner(System.in);
			System.out.println("Input product name");
			int productt=sc.nextInt();
			System.out.println("Input quantity");
			int qt=sc.nextInt();
			System.out.println("Input price");
			int pricet=sc.nextInt();
			product[index]=productt;
			q[index]=qt;
			price[index] = pricet;
			System.out.println("Product added into inventory");
			index++;
		}
		
		void displayinventory()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println("Name:"+product[i]);
				System.out.println("Quantity:"+q[i]);
				System.out.println("Price:"+price[i]);
			}
		}
		
		void searchproduct()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("input product to be searched");
			String sp=sc.next();
			int flag=0;
			for(int i=0;i<index;i++)
			{
				if(product[i].equalsIgnoreCase(sp))
				{
					System.out.println("found at "+i);
					flag=1;
				}
			}
			if(flag==0)
				System.out.println("product not found");
		}
}