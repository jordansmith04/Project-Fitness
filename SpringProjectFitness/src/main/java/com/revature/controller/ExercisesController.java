package com.revature.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.ExercisesService;

@RestController("exercisesController")
@RequestMapping(path="/exercises")
public class ExercisesController {

	private ExercisesService exercisesService;
	
	public ExercisesController(ExercisesService exercisesService) {
		this.exercisesService = exercisesService;
	}
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "index";
	}
	
	@RequestMapping(path = "/message", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody //This denotes that this method writes directly to the response body.
	public String getJsonMessage() {
		return "This is JSON!";
	}	
	
}
