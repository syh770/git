<%@page import="com.sc.entity.XsCustomerInfo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>添加客户 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
    <form action="salelistctrl/addsalelist.do" method="post" class="form form-horizontal" id="form-member-add">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>制单日期：</label>
				<div class="formControls col-xs-8 col-sm-9">
				    <input type="hidden" class="input-text" value="${salelist.salesId}" placeholder="" id="salesId" name="salesId">
				    	<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" 
			         	value="<fmt:formatDate value='${salelist.creatListDate}' pattern='yyyy-MM-dd ' />"
			        	id="creatListDate" name="creatListDate"  class="input-text Wdate" style="width:200px;">
				 </div>
			</div>	
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">发票号码：</label>
				<div class="formControls col-xs-8 col-sm-9">			   
				    <input type="text"  value="${salelist.invoiceNumber}" placeholder="" id="invoiceNumber" name="invoiceNumber">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">用户编号：</label>
				<div class="formControls col-xs-8 col-sm-9">			   
				    <input type="text"  value="${salelist.userId}" placeholder="" id="userId" name="userId">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">客户编号：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${salelist.customerId}" placeholder="" id="customerId" name="customerId">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">销售金额：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${salelist.saleAmount}" placeholder="" id="saleAmount" name="saleAmount">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">销售出库状态：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${salelist.saleDeliveryStatus}" placeholder="" id="saleDeliveryStatus" name="saleDeliveryStatus">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">是否返利：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${salelist.isRebate}" placeholder="" id="isRebate" name="isRebate">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">订单状态：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${salelist.orderStatus}" placeholder="" id="orderStatus" name="orderStatus">
				</div>	
			</div>		
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">备注信息：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<textarea name="noteInformation" value="${salelist.noteInformation}" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)">${salelist.noteInformation}</textarea>
					<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
				</div>
			</div>		
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">公司编号：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${salelist.companyId}" placeholder="" id="companyId" name="companyId">
				</div>
			</div>	
			<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">最后修改时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" 
			   	value="<fmt:formatDate value='${salelist.lastModifyDate}' pattern='yyyy-MM-dd HH:mm:ss' />"
			   	id="lastModifyDate" name="lastModifyDate"  class="input-text Wdate" style="width:200px;">
			</div>
		</div>			
		</form>
		
	</article>
</article>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules:{
			customerName:{
				required:true,
				
			},			
			phoneMove:{
				required:true,
				isMobile:true,
			},
			email:{
				required:true,
				email:true,
			},
			
			
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.msg('添加成功!',{icon: 5,time:1000});
			parent.layer.close(index);
	
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>