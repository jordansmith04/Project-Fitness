package com.revature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Userinfo;
import com.revature.repository.UserinfoRepo;

@Service("UserinfoService")
	public class UserinfoService {

		@Autowired //Wire your polkamanRepository bean in using this annotation!
		private UserinfoRepo userRepository;
		
		public Userinfo findUserByUsername(String username){	
			return this.userRepository.findUserByUsername(username);
		}
		
		public void insertUser(Userinfo b) {
			Userinfo user = userRepository.findUserByUsername(b.getUsername());
			if(user.getUsername() != null) {
			this.userRepository.updateUser(b);
		} else {
			this.userRepository.insertUser(b);
		}
		};
}
