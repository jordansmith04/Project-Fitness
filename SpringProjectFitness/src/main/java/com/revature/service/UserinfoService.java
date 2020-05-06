package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.revature.models.Userinfo;
import com.revature.repository.UserinfoRepository;

@Service("userinfoService")
public class UserinfoService {
	
	@Autowired
	private UserinfoRepository userinfoRepository;

	public Userinfo findById(@Param("id") int id) {
		return this.userinfoRepository.findById(id);
	};
	
	public <S extends Userinfo> S saveAndFlush(Userinfo p) {
		return this.userinfoRepository.saveAndFlush(p);
	};
}
