package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerLose;
import com.sc.service.XsCustomerContactService;
import com.sc.service.XsCustomerLoseService;

@Controller
@RequestMapping("/losectrl")
public class XsCustomerLoseController {

	//Ҫ����service ע�����
	@Autowired
    XsCustomerLoseService xsLoseService;
	
	@RequestMapping("/selectlose.do")
	public ModelAndView selectlose(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //����Ĭ��ֵ ���û������Ĭ��ֵ
			@RequestParam(defaultValue="8")Integer pageSize,
			XsCustomerLose lose){
		System.out.println("�����ѯ�ͻ���ʧ��Ϣ��ҳ������"+lose);
		System.out.println("----"+lose.getDatemin());
		System.out.println("----"+lose.getDatemax());
		
		PageInfo<XsCustomerLose> page = xsLoseService.selectlose(pageNum, pageSize, lose);
		System.out.println();
		mav.addObject("p", page);	
		mav.setViewName("xs/lose-list");//��ͼ����  /WEB-INF/xs/lose-list.jsp
		mav.addObject("lose",lose);
		return mav;
	}
	
	@RequestMapping("/goaddlose.do")
	public ModelAndView goAddLose(ModelAndView mav,XsCustomerLose lose){
		System.out.println("�����޸�ҳ��"+lose);	
		//�޸ĵ�ʱ�� ͨ��id��ȡ���� �ڲ�ѯһ��  �޸ĵ�ʱ��������Ϣ�Ͳ�����д��
		if(lose.getLoseId()!=null){
			lose=xsLoseService.getlose(lose.getLoseId());
		}
		mav.setViewName("xs/lose-add");
		mav.addObject("lose",lose);
		return mav;
	}
	
	@RequestMapping("/addlose.do")
	@ResponseBody
	public Message addLose(ModelAndView mav,XsCustomerLose lose){
		System.out.println("�����޸Ŀͻ���ʧ��Ϣ:"+lose);
		xsLoseService.updatelose(lose);
        return new Message("1", "success", "�ɹ�");
	}
	
	@RequestMapping("/deletelose.do")
	@ResponseBody
	public Message deleteLose(ModelAndView mav,XsCustomerLose lose){
		System.out.println("����ɾ����ʧ��¼:"+lose);
		xsLoseService.deletelose(lose.getLoseId());	
	    return new Message("1", "success", "�ɹ�");
	}
	
	@RequestMapping("/deleteloseall.do")
	public String deleteLoseAll(ModelAndView mav,long[] ids){
		System.out.println("��������ɾ����ʧ��¼:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsLoseService.deletelose(id);
			}
		}		
		return "redirect:selectlose.do";
	}
}
