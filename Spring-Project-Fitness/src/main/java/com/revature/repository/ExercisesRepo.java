package com.revature.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Exercises;

public class ExercisesRepo {

	
	@Autowired //Wire your polkamanRepository bean in using this annotation!
	private ExercisesRepo exerRepository;
	
	public List<Exercises> getAllPastworkouts(){
		return this.exerRepository.findAll();
	}
	
	public void insertExercise(Exercise p) {
		this.exerRepository.save(p);
	}
	
	public List<Exercises> getPastworkoutsById(int id){
		return this.exerRepository.findAllById(id);
	}
}


