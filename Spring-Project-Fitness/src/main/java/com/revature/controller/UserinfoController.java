package com.revature.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Userinfo;
import com.revature.service.UserinfoService;

@RestController("UserinfoController")
@RequestMapping(path= "/user")
public class UserinfoController {

	private UserinfoService uService;
	
	@Autowired
	public UserinfoController(UserinfoService uService) {
		this.uService = uService;
	}
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Userinfo> getUserinfoById(@PathVariable int id){
		return this.uService.getUserinfoById(id);
	}
	
	@PostMapping(path= "/userinfo")
	@ResponseBody
	public void saveUserinfo(Userinfo S) {
		this.uService.saveUserinfo(S);
	}
	
}

