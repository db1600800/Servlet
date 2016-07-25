package remote;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 try{
			  
			  Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1234);
			  LocalInterface localObject=(LocalInterface)registry.lookup("ImpleRemote");
			  System.out.println(localObject.getString());//调用远程对象的方法
			  
		//   String host=(args.length>0)?args[0]:"localhost";//从命令行读取需要连接的主机名
		//   System.out.println(host);
		//   //通过URL在远程主机上查找对象，并把它转化为本地接口LocalInterface类型
		//   LocalInterface localObject=(LocalInterface)Naming.lookup("rmi://"+host+"/remote.LocalInterface");
		//   System.out.println(localObject.getString());//调用远程对象的方法
//		     
		  }catch(RemoteException e){
		   System.out.println(e.toString());
		  }catch(NotBoundException ex){
		   System.out.println(ex.toString());
		  }
		 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
