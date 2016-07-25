package remote;

import java.rmi.*;

//这是一个本地接口类，而不是实现
public interface LocalInterface extends Remote{
public String getString() throws RemoteException;
}