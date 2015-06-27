package test;



/**订单查询0040*/
public class RequestParam0040{
/** 会员编号 备注:必填*/
public String cstmNo;
/** 订单号 备注:必填*/
public String orderNo;
/** 业务代号 备注:必填*/
public String busiNo;
/** 订单状态数量 备注:必填*/
public int orderStatusNum;
/** 订单状态 备注:必填*/
public String orderStatus;
/** 订单状态数量 备注:必填*/
//public int orderStatusNum;
/** 结束日期 备注:必填*/
public String endDate;
/** 渠道代号 备注:选填*/
public String channelNo;
/** 支付方式 备注:选填*/
public String payType;
/** 排序方式 备注:选填*/
public String sortType;
/** 排序字段代号 备注:选填*/
public String sortFieldID;
/** 查询订单类型标志 备注:选填*/
public String queryTypeFlag;
/** 当前页码 备注:必填*/
public int pageCode;
/** 页码大小 备注:必填*/
public int pageNum;


/** 开始日期 备注:必填*/
public String startDate;
}


