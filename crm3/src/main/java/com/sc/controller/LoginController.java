package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.XtUserAccount;



@Controller   //�Ѹ���ע���bean���󣬲�����Ϊ���������
@RequestMapping("/loginctrl")  //����������һ������ӳ���url��ַ
public class LoginController {
	
	 
	//��½ʧ�ܵķ���
	@RequestMapping("/login.do")
	public ModelAndView login(ModelAndView mav,HttpServletRequest req) {
		System.out.println("�û���֤ʧ��");
		//ͨ����֤ʧ�ܵ��������ƻ�ȡ��Ӧ��ֵ
		String msg = (String) req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("��֤ʧ�ܵ���Ϣ��"+msg);
		String fail = "";
		if (msg!=null) {
			if (msg.equals(UnknownAccountException.class.getName())) {
				fail = "unknown";//�˻�������
			}else if (msg.equals(IncorrectCredentialsException.class.getName())) {
				fail = "error";
			}else if (msg.equals("randomCodeError")) {
				fail = "code";
			}else {
				fail = "other";
			}
		}
		mav.setViewName("redirect:../login.jsp?isfail="+fail); 
		return mav;
	}
	
	@RequestMapping("/main.do")
	public ModelAndView main(ModelAndView mav,HttpSession session) {
		System.out.println("�û���֤�ɹ�");
		
		Subject subject = SecurityUtils.getSubject();
		XtUserAccount xtUserAccount = (XtUserAccount) subject.getPrincipal();
		session.setAttribute("nowuser", xtUserAccount);		
		mav.setViewName("redirect:../index.jsp"); 
		return mav;
	}
	

}
