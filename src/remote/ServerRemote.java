package remote;

import java.rmi.*;
import java.net.*;

//http://blog.sina.com.cn/s/blog_5a08b1780100bviy.html

public class ServerRemote {
 public static void main(String[] args){
  try{
   ImpleRemote local=new ImpleRemote();//生成远程对象的一个实例
   Naming.rebind("rmi:///remote.LocalInterface",local);//将远程对象实例绑定到LocalInterface
   
  }catch(RemoteException e){
   System.out.println("RemoteException"+e);
  }
  catch(MalformedURLException mfe){
   System.out.println("MalformedURLException:"+mfe);
  }
 }
}