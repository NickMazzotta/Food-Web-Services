package com.simpleRestfulWebServices.foodservices.FoodItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.simpleRestfulWebServices.foodservices.exception.FoodItemNotFoundException;

@RestController
public class FoodController {
	
	@Autowired
	FoodDaoService service;
	
	@GetMapping(path="/foods")
	public List<Food> retrieveAllFoods() {
		List<Food> foods = service.findAll();
		if (foods.isEmpty())
			throw new FoodItemNotFoundException("Foods list empty");
		return foods;
	}
	
	@GetMapping(path="/foods/{name}")
	public Food retrieveFoodByName(@PathVariable String name) {
		Food food = service.findOne(name);
		
	}

}
