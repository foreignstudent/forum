package com.forum.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.login.mapper.LoginMapper;
import com.forum.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapper loginMapper;

	@Override
	public String loginService() {
		// TODO Auto-generated method stub
		String queryUser = loginMapper.queryUser();
		return queryUser;
	}

}
