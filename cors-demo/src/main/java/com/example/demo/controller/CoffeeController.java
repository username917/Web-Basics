package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coffee;
import com.example.demo.model.Size;

@RestController
@RequestMapping("/api/coffee")
//@CrossOrigin(origins = "http://localhost:3000")
public class CoffeeController {
	
	private List<Coffee> coffeeList = new ArrayList<>();
	
	public CoffeeController() {
		
		coffeeList.add(new Coffee(1, "Americano", Size.GRANDE));
		coffeeList.add(new Coffee(2, "Latte", Size.GRANDE));
		coffeeList.add(new Coffee(3, "Macchiato", Size.GRANDE));
		
		
	}
	
	@GetMapping
	public List <Coffee> findAll() {
		return coffeeList;
	}
	
	@DeleteMapping
	public void delete(Integer id) {
		coffeeList.removeIf(coffee -> coffee.id().equals(id));
	}

}
