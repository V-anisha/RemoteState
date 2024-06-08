package vanishapkg;
import java.util.Scanner;

class NoSuchEmployeeException extends Exception 
{
 public NoSuchEmployeeException(String message) 
 {
     super(message);
 }
}

public class exception
{
 public static void main(String[] args) 
 {
 	Scanner sc = new Scanner(System.in);
     try 
     {
    	 System.out.println("enter the product name");
         String productName = sc.next();
         validateProductName(productName);
         sc.close();
     } 
     catch (NoSuchEmployeeException e) 
     {
         System.out.println("Message: " + e.getMessage());
     }
 }


 static void validateProductName(String productName) throws NoSuchEmployeeException {
     if (!productName.equals("snacks") && !productName.equals("stationary") && !productName.equals("bakery")) {
         throw new NoSuchEmployeeException("No such product category found: " + productName);
     }
     System.out.println("Valid product name: " + productName);
 }
}
