package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Exercises;
import com.revature.repository.ExercisesRepo;

@Service("ExerciseService")
public class ExercisesService {

		@Autowired //Wire your polkamanRepository bean in using this annotation!
		private ExercisesRepo exerRepository;
		
		public List<Exercises> getAllExercises(){
			return this.exerRepository.findAll();
		}
		
		public void insertExercise(Exercises p) {
			this.exerRepository.save(p);
		}
		
		public List<Exercises> getExercisesById(int id){
			return this.exerRepository.findAllById(id);
		}
}
