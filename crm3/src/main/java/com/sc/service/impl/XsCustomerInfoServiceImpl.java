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
import com.sc.entity.XsCustomerInfoExample;
import com.sc.entity.XsCustomerInfoExample.Criteria;
import com.sc.mapper.XsCustomerInfoMapper;
import com.sc.service.XsCustomerInfoService;

@Service  //���������Ҫ��
public class XsCustomerInfoServiceImpl implements XsCustomerInfoService {
	@Autowired
	XsCustomerInfoMapper xsCustomerMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addcustomer(XsCustomerInfo customer) {
		// TODO Auto-generated method stub
		xsCustomerMapper.insert(customer);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatecustomer(XsCustomerInfo customer) {
		// TODO Auto-generated method stub
        if(customer!=null&&customer.getCustomerId()!=null){
        	xsCustomerMapper.updateByPrimaryKey(customer);      	
        }//ҵ���߼�
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletecustomer(Long customerId) {
		// TODO Auto-generated method stub
		if(customerId!=null){
        	xsCustomerMapper.deleteByPrimaryKey(customerId);
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsCustomerInfo getcustomer(Long customerId) {
		// TODO Auto-generated method stub
		if(customerId!=null){
			return xsCustomerMapper.selectByPrimaryKey(customerId);
        }	
		return null;//=null��ֱ�ӷ��ؿ� ���ò����ݿ�
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XsCustomerInfo> selectcustomer(Integer pageNum, Integer pageSize, XsCustomerInfo customer) {
		XsCustomerInfoExample example=new XsCustomerInfoExample();
		if(customer!=null){
			Criteria criteria = example.createCriteria();
			//if(customer.getCustomerName()!=null&&customer.getCustomerName().equals("")){
			if(!StringUtils.isEmpty(customer.getCustomerName())){//�ͻ�����ģ����ѯ
				System.out.println("----С----"+customer.getCustomerName());
				criteria.andCustomerNameLike("%"+customer.getCustomerName()+"%");
			}
			if(!StringUtils.isEmpty(customer.getDatemin())){//����޸�ʱ����ڵ�����С����
				System.out.println("----С----"+customer.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(customer.getDatemin());				
			}
			if(!StringUtils.isEmpty(customer.getDatemax())){//����޸�ʱ��С�ڵ����������
				Date d=customer.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----��----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
	
		
		
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		
		List<XsCustomerInfo> list=xsCustomerMapper.selectByExample(example);
		PageInfo<XsCustomerInfo> page=new PageInfo<XsCustomerInfo>(list);
		return page;
	}

}
