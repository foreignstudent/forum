package com.forum.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class ResultMap {
	
	public static String errorMsg(String flag, String msg) {
		Map<String, Object> map = new HashMap<>();
		map.put("flag", flag);
		map.put("msg", msg);
		return JSON.toJSONString(map);
	}
	
	public static String successMsg() {
		Map<String, Object> map = new HashMap<>();
		map.put("flag", 0);
		map.put("msg", "执行成功");
		return JSON.toJSONString(map);
	}

}
