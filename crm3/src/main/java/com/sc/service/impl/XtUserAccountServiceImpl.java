package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import com.sc.entity.XtUserAccountExample.Criteria;
import com.sc.mapper.XtUserAccountMapper;
import com.sc.service.XtUserAccountService;

@Service
public class XtUserAccountServiceImpl implements XtUserAccountService {
	
	
	@Autowired
	XtUserAccountMapper xtUserAccountMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtUserAccount login(String userName) {
		
		XtUserAccountExample example = new XtUserAccountExample();
		Criteria criteria = example.createCriteria();
		//�����û��˺ŵ�����
		criteria.andUserNameEqualTo(userName);
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			return	list.get(0);
		}
		return null;
	}

}
