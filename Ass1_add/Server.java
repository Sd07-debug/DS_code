import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1095);
            registry.rebind("MathServer", new ServerImpl());
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e);
        }
    }
}
