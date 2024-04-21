import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create and bind the remote object
            ServerImpl obj = new ServerImpl();
            Registry registry = LocateRegistry.createRegistry(1096);
            registry.rebind("MathServer", obj);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
