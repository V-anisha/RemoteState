package app;
import java.sql.*;
import java.util.Scanner;
public class Food {
	

	    private static Connection connection;

	    public static void main(String[] args) {
	        initializeDatabase();

	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("1. Place Order");
	            System.out.println("2. View Orders");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    placeOrder();
	                    break;
	                case 2:
	                    viewOrders();
	                    break;
	                case 3:
	                    System.out.println("Exiting the app. Thank you!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 3);

	        scanner.close();
	        closeDatabase();
	    }

	    private static void initializeDatabase() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery", "your_username", "your_password");

	            Statement statement = connection.createStatement();
	            statement.execute("CREATE TABLE IF NOT EXISTS orders (id INT AUTO_INCREMENT PRIMARY KEY, " +
	                    "customer_name VARCHAR(255), item_name VARCHAR(255))");
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void closeDatabase() {
	        try {
	            if (connection != null && !connection.isClosed()) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void placeOrder() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String customerName = scanner.nextLine();

	        System.out.print("Enter the item you want to order: ");
	        String itemName = scanner.nextLine();

	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders (customer_name, item_name) VALUES (?, ?)");
	            preparedStatement.setString(1, customerName);
	            preparedStatement.setString(2, itemName);
	            preparedStatement.executeUpdate();

	            System.out.println("Order placed successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void viewOrders() {
	        try {
	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders");

	            System.out.println("Orders:");

	            while (resultSet.next()) {
	                int orderId = resultSet.getInt("id");
	                String customerName = resultSet.getString("customer_name");
	                String itemName = resultSet.getString("item_name");

	                System.out.println("Order ID: " + orderId + ", Customer: " + customerName + ", Item: " + itemName);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}