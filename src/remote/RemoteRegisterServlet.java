package remote;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RemoteRegisterServlet extends HttpServlet {

 /**
  * Constructor of the object.
  */
 public RemoteRegisterServlet() {
  
  super();
  System.out.println("RemoteRegisterServlet构造函数");
 }

 /**
  * Destruction of the servlet. <br>
  */
 public void destroy() {
  super.destroy(); // Just puts "destroy" string in log
  // Put your code here
 }

 /**
  * The doGet method of the servlet. <br>
  *
  * This method is called when a form has its tag value method equals to get.
  * 
  * @param request the request send by the client to the server
  * @param response the response send by the server to the client
  * @throws ServletException if an error occurred
  * @throws IOException if an error occurred
  */
 public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
  doPost(request, response);

  System.out.println("RemoteRegisterServlet  doGet");
 }

 /**
  * The doPost method of the servlet. <br>
  *
  * This method is called when a form has its tag value method equals to post.
  * 
  * @param request the request send by the client to the server
  * @param response the response send by the server to the client
  * @throws ServletException if an error occurred
  * @throws IOException if an error occurred
  */
 public void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

	  System.out.println("RemoteRegisterServlet  doPost");
 }
 public void bind() throws Exception{
//  Registry registry = LocateRegistry.createRegistry(1234);
//  ImpleRemote ti=new ImpleRemote();
//  
//  registry.bind("ImpleRemote", ti);
//  
  
 
  
  
  try{
	   ImpleRemote local=new ImpleRemote();//生成远程对象的一个实例
	   Naming.rebind("rmi:///remote.LocalInterface",local);//将远程对象实例绑定到LocalInterface
	   

	   System.out.println("RemoteRegisterServlet  bind");
	  }catch(RemoteException e){
	   System.out.println("RemoteException"+e);
	  }
	  catch(MalformedURLException mfe){
	   System.out.println("MalformedURLException:"+mfe);
	  }
	 
	 
	 
	 
}
  
 

 /**
  * Initialization of the servlet. <br>
  *
  * @throws ServletException if an error occurs
  */
 public void init() throws ServletException {

  try {
   
   bind();
   
   
  } catch (Exception e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  // Put your code here
 }

}