package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Pastworkouts;
import com.revature.repository.PastworkoutRepo;

public class PastworkoutsService {

	@Service("PastworkoutService")
	public class PastworkoutService {

		@Autowired //Wire your polkamanRepository bean in using this annotation!
		private PastworkoutRepo pastworkoutsRepository;
		
		public List<Pastworkouts> getAllPastworkouts(){
			return this.pastworkoutsRepository.findAll();
		}
		
		public void insertPastworkout(Pastworkouts p) {
			this.pastworkoutsRepository.save(p);
		}
		
		public List<Pastworkouts> getPastworkoutsById(int id){
			return this.pastworkoutsRepository.findAllById(id);
		}
	
}
