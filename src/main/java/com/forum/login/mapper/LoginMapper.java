package com.forum.login.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	
	public String queryUser(Map<String,Object> paramMap);
	
	public Integer userCheck(Map<String,Object> paramMap);

}
