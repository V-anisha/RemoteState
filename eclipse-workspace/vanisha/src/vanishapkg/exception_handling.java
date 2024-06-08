package vanishapkg;

public class exception_handling {
    public static void main(String[] args) {
        try 
        {
            String name = null;
            int length = name.length(); 
            System.out.println("Length of the name: " + length); 
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, regardless of exceptions.");
        }

       
        System.out.println("Program continues after exception handling.");
    }
}