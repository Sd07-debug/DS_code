import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Get the remote object's stub
            Registry registry = LocateRegistry.getRegistry("localhost", 1096);
            ServerIntf stub = (ServerIntf) registry.lookup("MathServer");

            // Prompt user for input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double x = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double y = scanner.nextDouble();

            // Call remote methods
            System.out.println("Addition result: " + stub.add(x, y));
            System.out.println("Subtraction result: " + stub.subtract(x, y));
            System.out.println("Multiplication result: " + stub.multiply(x, y));
            System.out.println("Division result: " + stub.divide(x, y));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
