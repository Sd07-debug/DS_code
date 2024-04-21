import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1095);
            ServerIntf stub = (ServerIntf) registry.lookup("MathServer");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double x = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double y = scanner.nextDouble();
            System.out.println("Addition result: " + stub.add(x, y));
        } catch (Exception e) {
            System.err.println("Client exception: " + e);
        }
    }
}
