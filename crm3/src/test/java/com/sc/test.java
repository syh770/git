package com.sc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;


public class test {
	
static String url="jdbc:oracle:thin:@42.51.78.5:1521:orcl";
static String user="CRM3";
static String password="scit_190506_crm3";

static Connection conn =null;
public static void main(String[] args) {
	      	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("���������ɹ�");	
		conn=DriverManager.getConnection(url, user, password);		
		System.out.println("�������ݿ�ɹ�");			    
		} catch (Exception e) {				
			System.out.println("ʧ��");
			}
}
}
