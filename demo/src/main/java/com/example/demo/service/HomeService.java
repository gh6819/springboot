package com.example.demo.service;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HomeDao;

@Service
public class HomeService {
	
	@Autowired
	private HomeDao homeDao;
	
	public void getTest(Map<String, Object> paramMap) {
		
	}
}
