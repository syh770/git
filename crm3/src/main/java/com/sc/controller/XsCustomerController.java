package com.sc.controller;

import java.math.BigDecimal;
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
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerFeedback;
import com.sc.entity.XsCustomerInfo;
import com.sc.service.XsContactRecordService;
import com.sc.service.XsCustomerContactService;
import com.sc.service.XsCustomerInfoService;
import com.sc.service.XsCustomerFeedbackService;

@Controller
@RequestMapping("/customerctrl")
public class XsCustomerController {

	//Ҫ����service ע�����
	@Autowired
	XsCustomerInfoService xsCustomerService;
	@Autowired
	XsCustomerContactService xsContactService;
	@Autowired
	XsContactRecordService xsRecordService;
	@Autowired
	XsCustomerFeedbackService xsFeedbackService;
   
	
	@RequestMapping("/selectcustomer.do")
	public ModelAndView selectcustomer(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //����Ĭ��ֵ ���û������Ĭ��ֵ
			@RequestParam(defaultValue="8")Integer pageSize,
			XsCustomerInfo customer){
		System.out.println("�����ѯ�ͻ���Ϣ��ҳ������"+customer);
		System.out.println("----"+customer.getDatemin());
		System.out.println("----"+customer.getDatemax());
		
		PageInfo<XsCustomerInfo> page = xsCustomerService.selectcustomer(pageNum, pageSize, customer);
		System.out.println();
		mav.addObject("p", page);	
		if(customer.getCustomerId()!=null){//id��Ϊ�� ����鿴����ҳ�� 
			customer=xsCustomerService.getcustomer(customer.getCustomerId());		
			mav.setViewName("xs/customer-detail");
		}else{
			mav.setViewName("xs/customer-list");//��ͼ����  /WEB-INF/xs/customer-list.jsp
		}
		mav.addObject("customer",customer);
		return mav;
	}
	
	@RequestMapping("/goaddcustomer.do")
	public ModelAndView goAddCustomer(ModelAndView mav,XsCustomerInfo customer){
		System.out.println("�������ҳ��"+customer);
		
		//�޸ĵ�ʱ�� ͨ��id��ȡ���� �ڲ�ѯһ��  �޸ĵ�ʱ��������Ϣ�Ͳ�����д��
		if(customer.getCustomerId()!=null){
			customer=xsCustomerService.getcustomer(customer.getCustomerId());
		}
		mav.setViewName("xs/customer-add");
		mav.addObject("customer",customer);
		return mav;
	}
	
	@RequestMapping("/addcustomer.do")
	@ResponseBody
	public Message addCustomer(ModelAndView mav,XsCustomerInfo customer){
		System.out.println("������ӿͻ�:"+customer);
		if(customer.getCustomerId()!=null){//���id��Ϊ�վ����޸�
			xsCustomerService.updatecustomer(customer);
		}else{
			xsCustomerService.addcustomer(customer);//����������  //����޸Ĺ���һ��ҳ��
		}
		
		return new Message("1", "success", "�ɹ�");
	}
	
	@RequestMapping("/deletecustomer.do")
	@ResponseBody
	public Message deleteCustomer(ModelAndView mav,XsCustomerInfo customer){
		System.out.println("����ɾ���ͻ�:"+customer);
		xsCustomerService.deletecustomer(customer.getCustomerId());	
	   return new Message("1", "success", "�ɹ�");
	}
	
	@RequestMapping("/deletecustomerall.do")
	public String deleteCustomerAll(ModelAndView mav,long[] ids){
		System.out.println("��������ɾ���ͻ�:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsCustomerService.deletecustomer(id);
			}
		}		
		return "redirect:selectcustomer.do";
	}
	
	@RequestMapping("/gocustomer.do") //ѡ�����
	public ModelAndView goCustomer(ModelAndView mav,XsCustomerInfo customer,HttpSession session){  
    	 System.out.println("�ͻ�����"+customer);	
    	 session.setAttribute("nowcustomerid", customer.getCustomerId());
    	
    	  // �ͻ���ϵ��
  	      XsCustomerContact contact=new XsCustomerContact();
  	      contact.setCustomerId(customer.getCustomerId());
   	      PageInfo<XsCustomerContact> page = xsContactService.selectcontact(1, 8, contact);
   	      mav.addObject("p", page);
		  mav.addObject("contact", contact);
		
		  //�ͻ���ϵ��¼
		  XsCustomerContactRecord record=new XsCustomerContactRecord();
		  record.setCustomerId(customer.getCustomerId());
	      PageInfo<XsCustomerContactRecord> page1 =xsRecordService.selectrecord(1, 8, record);
		  mav.addObject("p1", page1);
		  mav.addObject("record", record);
          
		  //�ͻ�����
		  XsCustomerFeedback feedback=new XsCustomerFeedback();
		  feedback.setCustomerId(customer.getCustomerId());
		  PageInfo<XsCustomerFeedback> page2 =xsFeedbackService.selectfeedback(1, 8,feedback);
		  mav.addObject("p2", page2);
		  mav.addObject("feedback", feedback);
          
	    	 	
    	  mav.setViewName("xs/customer-tab");
    	  return mav;
    }

}
