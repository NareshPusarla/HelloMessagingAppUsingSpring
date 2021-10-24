package com.bridgelabz.controller;

import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.HelloMessagingAppModel;
import com.bridgelabz.pojo.User;

@RestController
public class HelloMessagingAppController {

	@GetMapping("/welcomeMessage")
	public String welcomeMessage() {
		return "Hello user....";
	}

	@GetMapping("/welcomeMessageQueryParameter")
	public String welcomeMessageQueryParameter(@RequestParam("name") String name) {
		return "Hello user...." + name;
	}

	@GetMapping("/welcomeMessagePathVariable/{name}")
	public String welcomeMessagePathVariable(@PathVariable String name) {
		return "Hello user...." + name;
	}

	/*
	 * @RequestMapping(value = "/loaduserForm", method = RequestMethod.GET) public
	 * ModelAndView showUserForm() { ModelAndView mav = new ModelAndView();
	 * mav.setViewName("user"); return mav; }
	 */

	@PostMapping("/saveData")       //(path = "/saveData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveData(@RequestBody HelloMessagingAppModel user) {
		return "hi " + user.getFirstName()+" "+user.getLastName();
	}
	
	@PutMapping("/updateData/{firstname}")
	public String updateData(@PathVariable String firstName, @RequestParam(value="lastName") HelloMessagingAppModel user) {
		return "hi "+user.getFirstName()+" "+user.getLastName();
		
	}
}
