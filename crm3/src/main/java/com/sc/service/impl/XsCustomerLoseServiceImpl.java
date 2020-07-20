package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerInfo;
import com.sc.entity.XsCustomerLose;
import com.sc.entity.XsCustomerLoseExample;
import com.sc.entity.XsCustomerLoseExample.Criteria;
import com.sc.mapper.XsCustomerLoseMapper;
import com.sc.service.XsCustomerLoseService;

@Service
public class XsCustomerLoseServiceImpl implements XsCustomerLoseService {
	
	@Autowired
	XsCustomerLoseMapper xsLoseMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatelose(XsCustomerLose lose) {
		// TODO Auto-generated method stub
	   if(lose!=null&&lose.getLoseId()!=null){
		 xsLoseMapper.updateByPrimaryKey(lose);      	
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletelose(Long loseId) {
		// TODO Auto-generated method stub
		if(loseId!=null){
			xsLoseMapper.deleteByPrimaryKey(loseId);
	    }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsCustomerLose getlose(Long loseId) {
		// TODO Auto-generated method stub
		if(loseId!=null){
			return xsLoseMapper.selectByPrimaryKey(loseId);
        }	
		return null;//=null��ֱ�ӷ��ؿ� ���ò����ݿ�
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XsCustomerLose> selectlose(Integer pageNum, Integer pageSize, XsCustomerLose lose) {
		
		XsCustomerLoseExample example=new XsCustomerLoseExample();
		if(lose!=null){
			Criteria criteria = example.createCriteria();		
			if(!StringUtils.isEmpty(lose.getDatemin())){//����޸�ʱ����ڵ�����С����
				System.out.println("----С----"+lose.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(lose.getDatemin());				
			}
			if(!StringUtils.isEmpty(lose.getDatemax())){//����޸�ʱ��С�ڵ����������
				Date d=lose.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----��----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
	 
		}	
		// TODO Auto-generated method stub
				PageHelper.startPage(pageNum,pageSize);		
				List<XsCustomerLose> list=xsLoseMapper.selectByExample(example);
				PageInfo<XsCustomerLose> page=new PageInfo<XsCustomerLose>(list);
				return page;
			}

		}
