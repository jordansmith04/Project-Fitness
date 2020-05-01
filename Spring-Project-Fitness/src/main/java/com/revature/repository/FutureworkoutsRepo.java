package com.revature.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Futureworkouts;

public class FutureworkoutsRepo {

	
	@Autowired //Wire your polkamanRepository bean in using this annotation!
	private FutureworkoutsRepo futureworkoutsRepository;
	
	public List<Futureworkouts> getAllPastworkouts(){
		return this.futureworkoutsRepository.findAll();
	}
	
	public void insertPastworkout(Futureworkouts p) {
		this.futureworkoutsRepository.save(p);
	}
	
	public List<Futureworkouts> getPastworkoutsById(int id){
		return this.futureworkoutsRepository.findAllById(id);
	}
}
