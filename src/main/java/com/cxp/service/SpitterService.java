package com.cxp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cxp.domain.Spitter;
import com.cxp.repository.SpitterRepository;

@Component
public class SpitterService {
	@Autowired
	SpitterRepository repository;
	public List<Spitter> findAll(){
		List<Spitter> list = repository.findAll();
		return list;
	}
	
}
