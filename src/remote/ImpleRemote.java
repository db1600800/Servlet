package remote;

import java.rmi.*;
import java.rmi.server.*;
public class ImpleRemote extends UnicastRemoteObject implements LocalInterface{
 public ImpleRemote() throws RemoteException{}//构造函数抛出RemoteException异常
 public String getString() throws RemoteException{
  return ("这是一个远程调用的消息");//想客户返回一个消息串
 }
}