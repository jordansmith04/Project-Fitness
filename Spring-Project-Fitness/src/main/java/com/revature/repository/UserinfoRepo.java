package com.revature.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Userinfo;

@Repository("UserinfoRepo")
public interface UserinfoRepo extends JpaRepository<Userinfo, Integer>{

		public Userinfo getUserinfoById(int id);
		
		public void saveUserinfo(Userinfo S);
		
	}

	
