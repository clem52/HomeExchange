package com.lab.listinghome.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lab.listinghome.dao.HouseRepo;
import com.lab.listinghome.model.House;

@Controller
public class HouseController {
	
	

	@Autowired
	HouseRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "homesearch.jsp";
	}
	@RequestMapping("/addHouse")
	public String addHouse(House house)
	{
		repo.save(house);
		return "homesearch.jsp";
	}
	
	@RequestMapping("/getHouse")
    public String test(Model model,String city) {
        model.addAttribute("houses", repo.findByCityLike(city));
        return "showHouse.jsp";
    }
	
	   @ResponseBody
	    @RequestMapping("/cities")
	    public String showCityLike() {
	        List<House> houses = this.repo.findByCityLike("Paris");

	 
	        String html = "";
	        for (House emp : houses) {
	            html += emp + "<br>";
	        }
	 
	        return html;
	    }
	   
	}
	
	

