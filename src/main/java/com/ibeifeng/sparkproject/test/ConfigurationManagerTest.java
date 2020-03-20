package com.ibeifeng.sparkproject.test;

import com.ibeifeng.sparkproject.conf.ConfigurationManager;

/**
 * 配置管理组件测试类
 * @author Administrator
 *
 */
public class ConfigurationManagerTest {

	public static void main(String[] args) {
		String testkey1 = ConfigurationManager.getProperty("jdbc.url");
		String testkey2 = ConfigurationManager.getProperty("jdbc.url");
		System.out.println(testkey1);  
		System.out.println(testkey2);  
	}
	
}
