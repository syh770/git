package com.sc.controller;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContact;
import com.sc.entity.XsSaleDeliveryList;
import com.sc.entity.XsSaleDetail;
import com.sc.service.XsSaleDetailService;
import com.sc.service.XsSaleListService;

@Controller
@RequestMapping("/salelistctrl")
public class XsDeliveryListController {
	//Ҫ����service ע�����
		@Autowired
		XsSaleListService  xsListService;	
		@Autowired
		XsSaleDetailService  xsDetailService;	
		
		@RequestMapping("/selectsalelist.do")
		public ModelAndView selectsalelist(ModelAndView mav,
				@RequestParam(defaultValue="1") Integer pageNum, 
				@RequestParam(defaultValue="10")Integer pageSize,
				XsSaleDeliveryList salelist){
			System.out.println("�����ѯ���۵���ҳ������"+salelist);
			System.out.println("----"+salelist.getDatemin());
			System.out.println("----"+salelist.getDatemax());
			
			PageInfo<XsSaleDeliveryList> page = xsListService.selectsalelist(pageNum, pageSize, salelist);
			System.out.println();
			mav.addObject("p", page);	
			if(salelist.getSalesId()!=null){//id��Ϊ�� ����鿴����ҳ�� 
				salelist=xsListService.getsalelist(salelist.getSalesId());		
				mav.setViewName("xs/salelist-detail");
			}else{
				mav.setViewName("xs/salelist-list");//��ͼ����  /WEB-INF/xs/salelist-list.jsp
			}
			mav.addObject("salelist",salelist);
			return mav;
		}
		
		@RequestMapping("/goaddsalelist.do")
		public ModelAndView goAddSalelist(ModelAndView mav,XsSaleDeliveryList salelist){
			System.out.println("�������ҳ��"+salelist);
			
		
			if(salelist.getSalesId()!=null){
				salelist=xsListService.getsalelist(salelist.getSalesId());
			}
			
			mav.setViewName("xs/salelist-add");
			mav.addObject("salelist",salelist);
			return mav;
		}
		
		@RequestMapping("/addsalelist.do")
		@ResponseBody
		public Message addSalelist(ModelAndView mav,XsSaleDeliveryList salelist){
			System.out.println("����������۵�:"+salelist);
			if(salelist.getSalesId()!=null){//���id��Ϊ�վ����޸�
				xsListService.updatesalelist(salelist);
			}else{
				xsListService.addsalelist(salelist);//����������  //����޸Ĺ���һ��ҳ��
			}
			
			return new Message("1", "success", "�ɹ�");
		}
		
		@RequestMapping("/deletesalelist.do")
		@ResponseBody
		public Message deleteSalelist(ModelAndView mav,XsSaleDeliveryList salelist){
			System.out.println("����ɾ�����۵�:"+salelist);
			xsListService.deletesalelist(salelist.getSalesId());	
		   return new Message("1", "success", "�ɹ�");
		}
		
		@RequestMapping("/deletesalelistall.do")
		public String deletesalelistAll(ModelAndView mav,long[] ids){
			System.out.println("��������ɾ�����۵�:"+Arrays.toString(ids));
			if(ids!=null&&ids.length>0){
				for (long id : ids) {
					xsListService.deletesalelist(id);
				}
			}		
			return "redirect:selectsalelist.do";
		}
		
		@RequestMapping("/godetail.do")
		public ModelAndView godetail(ModelAndView mav,XsSaleDeliveryList salelist,HttpSession session){
			 System.out.println("���۵�����"+salelist);	
	    	 session.setAttribute("nowsaleid", salelist.getSalesId());
	    	 //ͨ��SalesId��ѯ�����۵��µ����鵥 ����model
	    	 
	    	  XsSaleDetail detail=new XsSaleDetail();
	    	  detail.setSalesId(salelist.getSalesId());
	   	      PageInfo<XsSaleDetail> page = xsDetailService.selectdetail(1, 8, detail);
	   	      mav.addObject("p", page);
			  mav.addObject("detail", detail);
			  
              mav.setViewName("xs/sale-tab");
	    	  return mav;
		}
		
		
		
}
