package com.revature.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Userinfo;
import com.revature.service.UserinfoService;

@RestController("userinfoController")
@RequestMapping(path="/user")
public class UserinfoController {

	private UserinfoService userinfoService;
	
	public UserinfoController(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}
	@GetMapping(path="/{username}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")
	public Userinfo findByUsername(@PathVariable String username) {
		return this.userinfoService.findByUsername(username);
	};
	
	@PostMapping(path="/NewUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")
	public <S extends Userinfo> Userinfo save(Userinfo p) {
		return this.userinfoService.save(p);
	};
}
