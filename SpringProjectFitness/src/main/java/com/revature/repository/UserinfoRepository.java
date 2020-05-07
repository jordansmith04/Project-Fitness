package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.models.Userinfo;

@Repository("userinfoRepository")
public interface UserinfoRepository extends JpaRepository<Userinfo, String>{

	
	Userinfo findByUsername(String username);
	<S extends Userinfo> S save(S Userinfo);
}
