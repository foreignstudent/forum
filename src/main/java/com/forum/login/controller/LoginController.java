package com.forum.login.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forum.login.service.LoginService;
import com.forum.util.ParamMap;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@ResponseBody
	@RequestMapping("login")
	public String loginController(HttpServletRequest request, HttpServletResponse response) {
		
		Map<String,Object> paramMap = ParamMap.getParamMap(request);
		
		return loginService.loginService(paramMap);
	}
	
	

}
