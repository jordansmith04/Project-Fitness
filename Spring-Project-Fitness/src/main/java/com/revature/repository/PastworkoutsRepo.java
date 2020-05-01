package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.models.Pastworkouts;
import com.revature.models.Workouts;


	
	@Repository("PastworkoutsRepository") //Don't forget to add your bean to the IOC container!
	public interface PastworkoutsRepo extends JpaRepository<Pastworkouts, Integer>{

		List<Pastworkouts> findAll();
		<S extends Pastworkouts> S save(Workouts p);
		List<Pastworkouts> findAllById(int userID);
};