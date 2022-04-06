package com.main.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.BoardMapper;
import com.main.dao.UserMapper;
import com.main.dto.BoardDto;
import com.main.dto.UserDto;

@Service
public class MainService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private BoardMapper boardMapper;
	
	public void getTest(Map<String, Object> paramMap) {
		List<UserDto> userList = userMapper.selectAllUser();
		List<BoardDto> boardList = boardMapper.selectAllBoard();
	}
}
