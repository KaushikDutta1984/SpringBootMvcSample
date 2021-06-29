package com.kaushik.SpringBootMvcSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kaushik.SpringBootMvcSample.Model.Alien;

@Controller
public class HomeController {
    
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i, @RequestParam("num2")int j, Model mv) {
		
		//ModelAndView mv = new ModelAndView("result");
		
		int result = i + j;
		//mv.addObject("result", result);
		mv.addAttribute("result", result);
		
		//return mv;
		return "result";
		
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien alien) {
		
		repo.save(alien);
		return "alien";
		
	}
	
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result", repo.findAll());
		return "showAliens";
		
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("getAlien")
	public String getAlien(@RequestParam("Aid")int Aid, Model m)
	{
		m.addAttribute("result", repo.getOne(Aid));
		return "showAliens";
		
	}
	
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String Name, Model m)
	{
		//m.addAttribute("result", repo.findByLocation(Name));
		m.addAttribute("result", repo.find(Name));
		return "showAliens";
		
	}
	
	
	
	
	@ModelAttribute
	public void AddAttributes(Model model) {
		model.addAttribute("creator", "Kaushik Dutta");
	}
	
	
}
