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
		
		public Optional<Userinfo> getUserinfoById(int id){
			return this.userRepository.findById(id);
		}
		
		public void saveUserinfo(Userinfo S) {
			this.userRepository.save(S);
		}
}
