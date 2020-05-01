package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Exercises;

@Repository("ExercisesRepo")
public interface ExercisesRepo extends JpaRepository<Exercises, Integer>{
	
	public List<Exercises> getAllPastworkouts();
	
	public void insertExercise(Exercises p);
	
	public List<Exercises> getExercisesById(int id);
}


