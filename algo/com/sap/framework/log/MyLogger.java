package com.sap.framework.log;

import com.sap.framework.log.config.LogConfigLoader;
import com.sap.iot.log.consumer.Service;

public class MyLogger {
	
	Class clazzName;
	static LogConfig config= LogConfigLoader.loadLogConfigs();
	
	public MyLogger(Class<Service> clazz) {
		this.clazzName = clazz;
	}

	public static void  setLogLevel(StaticLogLevel logLevel) {
		LogConfig.logLevel = logLevel;
	}
	
	public void error(String message) {
		System.out.println(message);
	}
	
	public void warn(String message) {
		System.out.println(message);
	}
	
	public void debug(String message) {
		System.out.println(message);
	}

	public void fine(String message) {
		System.out.println(message);
	}
	
	public void finer(String message) {
		System.out.println(message);
	}
	
	public static MyLogger getLogger(Class<Service> clazz) {
		return new MyLogger(clazz);
	}
}
