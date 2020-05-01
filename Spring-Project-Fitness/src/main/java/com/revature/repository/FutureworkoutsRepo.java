package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Futureworkouts;

@Repository("FutureworkoutsRepo")
public interface FutureworkoutsRepo extends JpaRepository<Futureworkouts, Integer>{

	
	public List<Futureworkouts> getAllPastworkouts();
	
	public void insertFutureworkout(Futureworkouts p);
	
	public List<Futureworkouts> getFutureworkoutsById(int id);
}
