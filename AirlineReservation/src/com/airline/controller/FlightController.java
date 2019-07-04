package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airline.bean.FlightDetails;
import com.airline.service.IFlightService;


@Controller
public class FlightController {

	@Autowired
	private IFlightService flightservice;
	
	  @RequestMapping("/index.obj")
		public String getHomePage(Model model){	
	    	model.addAttribute("flightdetailsList",flightservice.viewAllFlights());
			
			return "index";
		}
	  
		@RequestMapping(value="/displayFlight.obj")
		public String nextPage(@RequestParam String name, Model model)
		{
			try{
				List<FlightDetails> list = flightservice.viewAllFlights();
				if (list.isEmpty()) {
					String msg = "There are no flights";
					model.addAttribute("msg", msg);
					return "myError";
			}		
			model.addAttribute("list", list);
			return "Flight";
			}
			catch(DataAccessException dataAccessException)
			{
				model.addAttribute("msg","Technical Problem..Please Try Later!!");
				return "myError";
			}
		}
}
