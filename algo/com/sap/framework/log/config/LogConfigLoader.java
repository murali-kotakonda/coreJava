package com.sap.framework.log.config;

import com.sap.framework.log.LogConfig;

public class LogConfigLoader {
	
	public static LogConfig loadLogConfigs() {
		// xml , properties , json , annotation
		// load from the ConfigurationReader
		LogConfig jsonConfig = new JsonLogConfig().getLogConfig();
		
		return jsonConfig;
	}
}
