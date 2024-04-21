import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
    public ServerImpl() throws RemoteException {}

    @Override
    public double add(double x, double y) throws RemoteException {
        return x + y;
    }
}
