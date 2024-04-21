import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerIntf extends Remote {
    double add(double x, double y) throws RemoteException;
}
