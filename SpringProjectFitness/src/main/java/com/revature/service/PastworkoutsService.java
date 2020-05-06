package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Pastworkouts;
import com.revature.repository.PastworkoutsRepository;

@Service("pastworkoutsService")
public class PastworkoutsService {

	@Autowired
	private PastworkoutsRepository pastworkoutsRepository;


	public <S extends Pastworkouts> S save(Pastworkouts p) {
		return this.pastworkoutsRepository.save(p);	
	};
	
	public List<Pastworkouts> findAllByUserID(int userID){
		return this.findAllByUserID(userID);
	};
}
