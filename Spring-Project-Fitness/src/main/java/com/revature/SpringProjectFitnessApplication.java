package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Exercises;
import com.revature.models.Userinfo;
import com.revature.service.UserinfoService;

public class SpringProjectFitnessApplication {
	List<Exercises> list = new ArrayList<>();
	static Userinfo s = new Userinfo("admin", "admin1", 22, 72, 180, 2);
	static UserinfoService userInfoService = new UserinfoService();
	
	public static void main(String[] args) {
		
		userInfoService.insertUser(s);
		
//		SpringApplication.run(SpringProjectFitnessApplication.class, args);
		
		
		
		
	}

}
