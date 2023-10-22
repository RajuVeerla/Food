package com.rv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rv.dao.FoodDao;
import com.rv.entity.Food;
@Service
public class FoodService implements FoodDao {
	List<Food> flist=new ArrayList<>();

	public String addFood(Food food) {
		
		// TODO Auto-generated method stub
		flist.add(food);
		return "food item added successfully";
	}

	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return flist;
	}
	

}
