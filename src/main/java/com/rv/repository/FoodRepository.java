package com.rv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rv.entity.Food;

public interface FoodRepository extends  JpaRepository<Food,Integer> {

}
