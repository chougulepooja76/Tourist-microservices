package com.tourist.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.tourist.Entity.Tourist;
import com.tourist.Repository.TouristRepository;




@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="http://localhost:4200/")
public class TouristController {

	@Autowired
	private TouristRepository repo;
	
	
	//get All Tourist's
	@GetMapping("/tourists")
	public List<Tourist> getAllTourists()
	{
		return repo.findAll();
	}
	
	// Create Tourist rest api
	@PostMapping("/tourists")
	public Tourist createTourist(@RequestBody Tourist tourist)
	{
		return repo.save(tourist);
	}
	
	
	
	//first name by Descending order
	@GetMapping("/firstName")
	public List<Tourist> fingByFirstName(String firstName,Sort sort)
	{
		return repo.findAll(Sort.by(Sort.Direction.DESC, "firstName"));
	}
	
	
	
	
	
}

