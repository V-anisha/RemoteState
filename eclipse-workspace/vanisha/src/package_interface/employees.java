package package_interface;
import java.io.FileWriter;
import java.io.IOException;


class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class employees {
	 public static void main(String[] args) throws IOException {
	        // Create a FileWriter object to write to the file.
	        FileWriter fw = new FileWriter("C:\\Users\\Prakhar\\Desktop\\BCA\\3 SEM\\java lab\\employees.txt");

	        // Create an array of 5 employees.
	        Employee[] employees = new Employee[5];
	        employees[0] = new Employee("John Doe", 50000);
	        employees[1] = new Employee("Jane Doe", 60000);
	        employees[2] = new Employee("Peter Parker", 70000);
	        employees[3] = new Employee("Mary Jane Watson", 80000);
	        employees[4] = new Employee("Bruce Wayne", 90000);
	        System.out.println("successfully written");

	        // Write the employee data to the file.
	        for (Employee employee : employees) {
	            fw.write(employee.getName() + ", " + employee.getSalary() + "\n");
	        }

	        // Close the FileWriter object.
	        fw.close();
	    }
}