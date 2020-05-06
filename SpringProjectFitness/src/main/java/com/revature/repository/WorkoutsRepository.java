package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Workouts;

@Repository("workoutsRepository")
public interface WorkoutsRepository  extends JpaRepository<Workouts, Integer> {

	List<Workouts> findAllByExerciseNumber(int exerciseNumber);
	
	}
