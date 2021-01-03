package com.ds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.service.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService service;
	@GetMapping("select")
	public String select() {
		service.selectByDao();
		service.selectByCreate("西游记1");
		return "ok";
	}
	@GetMapping("update")
	public String update() {
		service.updateByDao();
		service.updateByCreate();
		return "ok";
	}
	@GetMapping("insert")
	public String insert() {
		service.insertByDao();
		return "ok";
	}
}
