package com.cxp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cxp.domain.Spitter;
import com.cxp.service.SpitterService;


@Controller
@RequestMapping("quick4/")
public class Quick4Controller {
	@Autowired
	SpitterService ss;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String findAll() {
		List<Spitter> spitters = ss.findAll();
		if(spitters.size()==0) {
			return "Can't find any spitters";
		}else {
			return Arrays.toString(spitters.toArray());
		}
	}
	
}
