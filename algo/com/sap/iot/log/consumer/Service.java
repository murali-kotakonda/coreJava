package com.sap.iot.log.consumer;

import com.sap.framework.log.StaticLogLevel;
import com.sap.framework.log.MyLogger;

public class Service {

	static MyLogger log = MyLogger.getLogger(Service.class);
	static {
		log.setLogLevel(StaticLogLevel.INFO);
	}
	public static void main(String[] args) {
		log.error("hello");
	}
	

}
