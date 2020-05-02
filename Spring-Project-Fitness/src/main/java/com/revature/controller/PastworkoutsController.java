package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Pastworkouts;
import com.revature.service.PastworkoutsService;

@RestController("PastworkoutsController")
@RequestMapping(path = "/Past")
public class PastworkoutsController {
	
	
	private PastworkoutsService pService;
	
	@Autowired
	public PastworkoutsController(PastworkoutsService pService) {
		this.pService = pService;
	}
	
	@PostMapping(path = "/AllPast", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Pastworkouts> getPastWorkouts() {
		List<Pastworkouts> list = pService.getAllPastworkouts();
		return list;
	}
	
	@GetMapping(path = "/NewPast/{p}")
	public void insertPastworkout(@PathVariable Pastworkouts p) {
		this.pService.insertPastworkout(p);
	}
	
	@RequestMapping (path = "/GetPast/{id}")
	public List<Pastworkouts> getPastworkoutsById(@PathVariable int id){
		return this.pService.getPastworkoutsById(id);
	}
	
	
	
}
