package com.sc.controller;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.service.XsContactRecordService;


@Controller
@RequestMapping("/recordctrl")
public class XsContactRecordController {

	//Ҫ����service ע�����
	@Autowired
	XsContactRecordService xsRecordService;
	
	@RequestMapping("/selectrecord.do")
	public ModelAndView selectrecord(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //����Ĭ��ֵ ���û������Ĭ��ֵ
			@RequestParam(defaultValue="10")Integer pageSize,
			XsCustomerContactRecord record){
		System.out.println("�����ѯ��ϵ��¼��ҳ������"+record);
		System.out.println("----"+record.getDatemin());
		System.out.println("----"+record.getDatemax());
		
		PageInfo<XsCustomerContactRecord> page = xsRecordService.selectrecord(pageNum, pageSize, record);
		System.out.println();
		mav.addObject("p", page);
		mav.addObject("record",record);
		mav.setViewName("xs/record-list");//��ͼ����  /WEB-INF/xs/record-list.jsp
		return mav;
	}
	
	@RequestMapping("/goaddrecord.do")
	public ModelAndView goAddRecord(ModelAndView mav,XsCustomerContactRecord record){
		System.out.println("�������ҳ��"+record);
		
	
		if(record.getContactRecordId()!=null){
			record=xsRecordService.getrecord(record.getContactRecordId());
		}
		
		mav.setViewName("xs/record-add");
		mav.addObject("record",record);
		return mav;
	}
	
	@RequestMapping("/addrecord.do")
	@ResponseBody
	public Message addRecord(ModelAndView mav,XsCustomerContactRecord record){
		System.out.println("���������ϵ��¼:"+record);
		if(record.getContactRecordId()!=null){//���id��Ϊ�վ����޸�
			xsRecordService.updaterecord(record);
		}else{
			xsRecordService.addrecord(record);//����������  //����޸Ĺ���һ��ҳ��
		}
		
		return new Message("1", "success", "�ɹ�");
	}
	
	@RequestMapping("/deleterecord.do")
	@ResponseBody
	public Message deleteRecord(ModelAndView mav,XsCustomerContactRecord record){
		System.out.println("����ɾ����ϵ��¼:"+record);
		xsRecordService.deleterecord(record.getContactRecordId());	
	   return new Message("1", "success", "�ɹ�");
	}
	
	@RequestMapping("/deleterecordall.do")
	public String deleteRecordAll(ModelAndView mav,long[] ids){
		System.out.println("��������ɾ����ϵ��¼:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsRecordService.deleterecord(id);
			}
		}		
		return "redirect:selectrecord.do";
	}
}
