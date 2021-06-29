package com.kaushik.SpringBootMvcSample;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaushik.SpringBootMvcSample.Model.Alien;

@RestController
public class AlienController {
    
	@Autowired
	AlienRepo repo;
	
	
	//@GetMapping(path="aliens", produces = {"application/xml"})
	@GetMapping(path="aliens", produces = {"application/json"})
	//@ResponseBody
	public List<Alien> getAliens()
	{
		List<Alien> aliens = repo.findAll();
		return aliens;
		
	}
	
	@GetMapping("alien/{Aid}")
	//@ResponseBody
	public Alien getAlien(@PathVariable("Aid") int aid)
	{
		Alien alien = repo.findById(aid).orElse(new Alien(0, ""));
		return alien;
		
	}
	
	@PostMapping(path="alien", consumes = {"application/json"})
	
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
		
	}
} 
