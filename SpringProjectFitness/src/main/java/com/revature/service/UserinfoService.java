package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Userinfo;
import com.revature.repository.UserinfoRepository;

@Service("userinfoService")
public class UserinfoService {
	
	@Autowired
	private UserinfoRepository userinfoRepository;

	public Userinfo findByUsername(String username) {
		return this.userinfoRepository.findByUsername(username);
	};
	
	public <S extends Userinfo> Userinfo insertUser(Userinfo p) {
		Userinfo u = new Userinfo();
		u.setUsername(p.getUsername());
		u.setPass(p.getPass());
		u.setAges(p.getAges());
		u.setHeights(p.getHeights());
		u.setWeight(p.getWeight());
		this.userinfoRepository.save(u);
		return u;
	};
}
