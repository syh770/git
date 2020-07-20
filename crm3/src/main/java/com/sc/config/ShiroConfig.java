package com.sc.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.form.CaptchaValidateFilter;
import com.sc.realm.CustomRealmMD5;

@Configuration  //������
public class ShiroConfig {
	

	
	//MD5������������
	@Bean
	public CustomRealmMD5 customRealmMD5() {
		CustomRealmMD5 realm = new CustomRealmMD5();
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
		matcher.setHashAlgorithmName("md5");
		matcher.setHashIterations(3);
		realm.setCredentialsMatcher(matcher);
		return realm;
	}
	
	//��ȫ������
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(this.customRealmMD5());
		return manager;
	}
	
	//Shiro������
	@Bean("shiroFilter")
	public ShiroFilterFactoryBean shiroFilter() {
		CaptchaValidateFilter form = new CaptchaValidateFilter();
		form.setLoginUrl("/loginctrl/login.do");
		form.setUsernameParam("userName");
		form.setPasswordParam("userPassword");
		
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(this.securityManager());
		shiroFilter.setLoginUrl("/login.jsp");
		shiroFilter.setSuccessUrl("/loginctrl/main.do");
		shiroFilter.setUnauthorizedUrl("/nopermission.jsp");
		
		
		LogoutFilter logout = new LogoutFilter();
		logout.setRedirectUrl("/login.jsp");
		
		Map<String, Filter> filters = new HashMap<String, Filter>();
		filters.put("authc", form);
		filters.put("logout", logout);
		shiroFilter.setFilters(filters);
		
		//����ʹ��LinkedHashMap
		Map<String, String> map = new LinkedHashMap<String, String>();
		//anon:���������ʣ�authc:��Ҫ��֤���ܷ���
		map.put("/css/**", "anon");
		map.put("/images/**", "anon");
		map.put("/js/**", "anon");
		map.put("/sql/**", "anon");
		map.put("/upload/**", "anon");
		map.put("/login.jsp", "anon");
		map.put("/main.jsp", "anon");
		map.put("/captcha/**", "anon");
		
		//�ǳ����˳���¼
		map.put("/logout.do", "logout");
		//Ȩ�����ã���Ȩ�ޱ��ѯ���е�Ȩ�޲������ã�
		/*
		 * List<SysPermission> list = sysPermissionService.getAllPermissions(); if
		 * (list!=null&&list.size()>0) { System.out.println("����Ȩ�޲����ã�"); for
		 * (SysPermission perm : list) { String url = perm.getUrl(); String code =
		 * perm.getPercode();
		 * if(code!=null&&!code.equals("")&&url!=null&&!url.equals("")) {
		 * System.out.println("=====url======="+url+"========code====="+code);
		 * map.put(url, "perms["+code+"]"); } } }
		 */
		
		
		
		map.put("/**", "authc");
		
		
		shiroFilter.setFilterChainDefinitionMap(map);
		return shiroFilter;
		
		
		
	}
}
