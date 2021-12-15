package com.forum.login.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.login.mapper.LoginMapper;
import com.forum.login.service.LoginService;
import com.forum.util.ResultMap;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapper loginMapper;

	@Override
	public String loginService(Map<String,Object> paramMap) {
		// TODO Auto-generated method stub
		Integer Integer = loginMapper.userCheck(paramMap);
		
		if("0".equals(String.valueOf(Integer))) {
			return ResultMap.errorMsg("-1", "用户名密码错误");
		}
		
		return ResultMap.successMsg();
	}

}
