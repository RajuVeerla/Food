package com.rv.dao;

import java.util.List;

import com.rv.entity.Food;

public interface FoodDao {
	public String addFood(Food food);
	public List<Food> getAllFood();

}
