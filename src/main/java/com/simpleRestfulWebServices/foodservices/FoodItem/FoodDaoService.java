package com.simpleRestfulWebServices.foodservices.FoodItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FoodDaoService {
	
	// dummy foods data
	private static List<Food> foods = new ArrayList<>();
	
	// methods
	public List<Food> findAll() {
		return foods;
	}
	
	public Food findOne(String name) {
		for(Food food : foods) {
			if(food.getName() == name)
				return food;
		}
		return null;
	}
	
	public Food save(Food food) {
		foods.add(food);
		return food;
	}
	
	public Food deleteByName(String name) {
		Iterator<Food> iterator = foods.iterator();
		while(iterator.hasNext()) {
			Food food = iterator.next();
			if(food.getName() == name) {
				iterator.remove();
				return food;
			}
		}
		return null;
	}

}
