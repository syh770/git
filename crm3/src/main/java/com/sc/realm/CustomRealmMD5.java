package com.sc.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.XtUserAccount;
import com.sc.service.XtUserAccountService;

public class CustomRealmMD5 extends AuthorizingRealm {
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	
	//�û���Ȩ
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		
		return null;

	}
	
	
	//�û���֤
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal();
		System.out.println("��ǰ����֤���û���:"+username);
		
		
		//1.��Ҫ�����ݿ��ѯ�Ƿ��и��û�
		XtUserAccount xtUserAccount = xtUserAccountService.login(username);
		if(xtUserAccount == null) {
			System.out.println("�����ڴ��û�");
		}
		//2.���û�������
		String password = xtUserAccount.getUserPassword();
		String salt = "qwerty";
		//��һ��������������������object
		SimpleAuthenticationInfo info =new SimpleAuthenticationInfo(xtUserAccount, password,ByteSource.Util.bytes(salt), super.getName());
		
		return info;
	}

}
