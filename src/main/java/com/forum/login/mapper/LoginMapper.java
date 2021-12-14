package com.forum.login.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	
	public String queryUser();

}
