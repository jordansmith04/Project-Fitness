package com.revature.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Futureworkouts;
import com.revature.service.FutureworkoutsService;

@RestController("futureworkoutsController")
@RequestMapping(path="/future")
public class FutureworkoutsController {

	private FutureworkoutsService futureworkoutsService;
	
	public FutureworkoutsController(FutureworkoutsService futureworkoutsService) {
		this.futureworkoutsService = futureworkoutsService;
	}
	
	@PostMapping(path="/NewFuture", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")
	public <S extends Futureworkouts> S save(Futureworkouts p) {
		return this.futureworkoutsService.save(p);
	};
	
	@GetMapping(path="/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Futureworkouts> findAllByUsername(@PathVariable String username){
		return this.futureworkoutsService.findAllByUsername(username);
	};
}
