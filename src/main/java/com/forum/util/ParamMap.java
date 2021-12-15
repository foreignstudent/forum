package com.forum.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 获取入参，拼装map返回
 * @author ForeignStudent
 */
public class ParamMap {
	
	private static Logger logger = LogManager.getLogger(ParamMap.class);
	
	public static Map<String, Object> getParamMap(HttpServletRequest request){
		
		Map<String, Object> map = new HashMap<>();
		
		Enumeration<String> parameterNames = request.getParameterNames();
		
		while(parameterNames.hasMoreElements()) {
			
			String nextElement = parameterNames.nextElement();
			
			String parameter = request.getParameter(nextElement);
			
			map.put(nextElement, parameter);
			
			logger.info("入参========>>" + nextElement + "=" + parameter);
		}
		
		return map;
		
	}

}
