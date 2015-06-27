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

import test.Serverlet4453030.Respond.ReturnData;
import test.Serverlet4453030.Respond.ReturnData.Head;

import com.google.gson.Gson;
/**
 * Servlet implementation class 
 */
@WebServlet(urlPatterns = "/Serverlet4453030", asyncSupported = true)
public class Serverlet4453030 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String parameter = "";
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Serverlet4453030() {
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
RequestParam4453030 bean = gson.fromJson(parameter, RequestParam4453030.class);
/** 退款申请流水号 备注:*/
System.out.println(bean.D44_70_REFOUND_ID);//String
/** 关联订单号 备注:2013-6-14此元素停用*/
System.out.println(bean.I_ORDER_NO) ;//String
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
respond.returnCode="string";
ReturnData returnData=respond.new ReturnData();
respond.returnData=returnData;
Head head=returnData.new Head();
returnData.head=head;
head.ret_errcode="string";
head.ret_msg="string";




/**退款单明细查询 4453030*/
CacheRespondParam4453030 cacheRespondParam4453030=new CacheRespondParam4453030(); 

returnData.body=cacheRespondParam4453030;

/** 退款单申请流水号 备注:*/
cacheRespondParam4453030.D44_70_REFOUND_ID="string";//String
/** 关联订单号 备注:*/
cacheRespondParam4453030.I_ORDER_NO="string";//String
/** 原订单受理渠道 备注:*/
cacheRespondParam4453030.D44_70_CHANNEL="string";//String
/** 退款类型 备注:*/
cacheRespondParam4453030.D44_70_REFOUND_TYPE="string";//String
/** 退款方式 备注:*/
cacheRespondParam4453030.D44_70_REFOUND_MODE="string";//String
/** 退款单状态 备注:*/
cacheRespondParam4453030.D44_70_REFOUND_STATUS="string";//String
/** 退款申请金额 备注:*/
cacheRespondParam4453030.D44_70_MONEY1=1;//float
/** 实际退款金额 备注:*/
cacheRespondParam4453030.D44_70_MONEY2=1;//float
/** 客户姓名 备注:*/
cacheRespondParam4453030.D44_70_CSTM_NAME="string";//String
/** 性别 备注:*/
cacheRespondParam4453030.D44_70_CSTM_SEXTYPE="string";//String
/** 联系电话 备注:*/
cacheRespondParam4453030.D44_70_TELEPHONE="string";//String
/** 申请机构号 备注:*/
cacheRespondParam4453030.D44_70_APPLYBRCHNO="string";//String
/** 申请机构名称 备注:*/
cacheRespondParam4453030.D44_70_APPLYBRCNNAME="string";//String
/** 申请柜员号 备注:*/
cacheRespondParam4453030.D44_70_APPLYOPERID="string";//String
/** 指派处理机构号 备注:*/
cacheRespondParam4453030.D44_70_DEALBRCHNO="string";//String
/** 指派处理机构名称 备注:*/
cacheRespondParam4453030.D44_70_DEALBRCHNAME="string";//String
/** 指派处理柜员号 备注:*/
cacheRespondParam4453030.D44_70_DEALOPERID="string";//String
/** 申请退款时间 备注:Yyyy-mm-dd hh:mm:ss*/
cacheRespondParam4453030.D44_70_APPLYDATETIME="string";//String
/** 退款时间 备注:Yyyy-mm-dd hh:mm:ss*/
cacheRespondParam4453030.D44_70_REFUNDDATETIME="string";//String
/** 备注 备注:*/
cacheRespondParam4453030.D44_70_REMARK="string";//String


/** 循环域开始 备注:退还酬金信息*/
cacheRespondParam4453030.D44_70_RECORDNUM1=1;//int
/** 机构类型 (数组)备注:01 加盟商 (订单受理机构)02 渠道(渠道代号)03 邮政(订单受理机构)04第三方 (第三方代号) 05支付方 (支付方式) */
cacheRespondParam4453030.D44_70_ORGAN_TYPE=new String[]{"string"};//String[]
/** 操作方式 (数组)备注:01 核减02 核加*/
cacheRespondParam4453030.D44_70_MAKESTATUS=new String[]{"string"};//String[]
/** 机构代码 (数组)备注:*/
cacheRespondParam4453030.D44_70_ORGANCODE=new String[]{"string"};//String[]
/** 柜员号 (数组)备注:*/
cacheRespondParam4453030.D44_70_BK_OPTNO=new String[]{"string"};//String[]
/** 原金额 (数组)备注:*/
cacheRespondParam4453030.D44_70_PRI_MONEY=new float[]{1};//float[]
/** 实际金额 (数组)备注:*/
cacheRespondParam4453030.D44_70_REAL_MONEY=new float[]{1};//float[]
/** 平台记账日期 (数组)备注:*/
cacheRespondParam4453030.D44_70_ACCOUNTDATE=new String[]{"string"};//String[]


/** 循环域开始 备注:退款操作日志信息*/
cacheRespondParam4453030.D44_70_RECORDNUM=1;//int
/** 退款操作形式中文 (数组)备注:*/
cacheRespondParam4453030.D44_70_CL_NAME=new String[]{"string"};//String[]
/** 处理机构号 (数组)备注:*/
cacheRespondParam4453030.D44_70_MAKEORGAN=new String[]{"string"};//String[]
/** 处理柜员号 (数组)备注:*/
cacheRespondParam4453030.D44_70_OPRID=new String[]{"string"};//String[]
/** 处理机构名称 (数组)备注:*/
cacheRespondParam4453030.D44_70_ORGANNAME=new String[]{"string"};//String[]
/** 操作时间 (数组)备注:*/
cacheRespondParam4453030.D44_70_LOGDATETIME=new String[]{"string"};//String[]
/** 日志内容 (数组)备注:*/
cacheRespondParam4453030.D44_70_BIG_DESC=new String[]{"string"};//String[]
					
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
public String returnCode;
public ReturnData returnData;

 class ReturnData{
public Head head;

 class Head{
public String ret_errcode;
public String ret_msg;
}
public CacheRespondParam4453030 body;

 class Body{
}
}
}
}

