package test;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.Serverlet0032.Respond.ReturnData;
import test.Serverlet0032.Respond.ReturnData.ReturnHead;

import com.google.gson.Gson;
/**
 * Servlet implementation class 
 */
@WebServlet(urlPatterns = "/Serverlet0032", asyncSupported = true)
public class Serverlet0032 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String parameter = "";
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Serverlet0032() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. start async
		final AsyncContext ctx = request.startAsync();
		parameter = ctx.getRequest().getParameter("parameter");



Gson gson = new Gson();
RequestParam0032 bean = gson.fromJson(parameter, RequestParam0032.class);
///** 会员编号 备注:必填*/
//bean.cstmNo"bbq";//String
///** 业务代号 备注:必填*/
//bean.busiNo"bbq";//String
		// 2. set the timeout
		ctx.setTimeout(500);
		// 3. add listener
		ctx.addListener(new AsyncListener() {
			@Override
			public void onTimeout(AsyncEvent arg0) throws IOException {
				System.out.println("onTimeout...");
			}
			@Override
			public void onStartAsync(AsyncEvent arg0) throws IOException {
				System.out.println("onStartAsync...");
			}
			@Override
			public void onError(AsyncEvent arg0) throws IOException {
				System.out.println("onError...");
			}
			@Override
			public void onComplete(AsyncEvent arg0) throws IOException {
				System.out.println("onComplete...");
			}
		});
		// 4. run a thread
		ctx.start(new Runnable() {
			@Override
			public void run() {
				try {
					ctx.getResponse().setContentType("application/json");
//000000 表示成功
Respond respond=new Respond();
ReturnData returnData=respond.new ReturnData();
respond.returnData=returnData;
ReturnHead returnHead=returnData.new ReturnHead();
returnData.returnHead=returnHead;
returnHead.respDesc="ok";
returnHead.respCode="0000";




/**购物车查询0032*/
CacheRespondParam0032 cacheRespondParam0032=new CacheRespondParam0032(); 


returnData.returnBody=cacheRespondParam0032;

/** 返回的记录数 备注:循环域开始*/
cacheRespondParam0032.recordNum=1;//int
/** 购物车代号 备注:*/
cacheRespondParam0032.shoppingCartID="bbq";//String
/** 业务代号 备注:*/
cacheRespondParam0032.busiNo="bbq";//String
/** 商品代号 备注:*/
cacheRespondParam0032.merchID="bbq";//String
/** 图片ID 备注:*/
cacheRespondParam0032.merchPicID="bbq";//String
/** 商品名称 备注:*/
cacheRespondParam0032.merchName="bbq";//String
/** 所属机构 备注:店铺名称*/
cacheRespondParam0032.brchNo="bbq";//String
/** 商品规格 备注:单张、四方连*/
cacheRespondParam0032.normsType="bbq";//String
/** 购买价格 备注:*/
cacheRespondParam0032.buyPrice=1;//float
/** 创建时间 备注:*/
cacheRespondParam0032.gmtCreate="bbq";//String
/** 修改时间 备注:*/
cacheRespondParam0032.gmtModify="bbq";//String
/** 返回的记录数 备注:循环域结束*/
cacheRespondParam0032.recordNum=1;//int
					
					PrintWriter writer = ctx.getResponse().getWriter();
					writer.write(new Gson().toJson(respond,Respond.class));
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				ctx.complete();
			}
		});
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	

 class Respond{
public ReturnData returnData;

 class ReturnData{
public ReturnHead returnHead;

 class ReturnHead{
public String respDesc;
public String respCode;
}
public CacheRespondParam0032 returnBody;

 class ReturnBody{
}
}
}
}

