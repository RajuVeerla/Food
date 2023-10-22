package com.rv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rv.entity.Food;
import com.rv.service.FoodService;

@RestController
@RequestMapping("/foodapi")
public class FoodController {
	
	@Autowired
	private FoodService fs;
	@PostMapping("/add")
	public String addFood(@RequestBody Food f) {
		return fs.addFood(f);
	}
	@GetMapping("/get")
	public List<Food> getAllFood(){
		return fs.getAllFood();
	}
	
	

}
