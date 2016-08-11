package spring.felix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.felix.model.User;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method=RequestMethod.GET, value="/home")
	public String home(String username, Model model){
		User u = new User();
		u.setUsername(username);
		u.setPwd("userpwd");
		model.addAttribute(u);
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public User index(String username){
		User u = new User();
		u.setUsername(username);
		u.setPwd("userpwd");
		return u;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/input")
	public String input(User user){
		
		return "hello/input";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/home")
	public User postHome(User user){
		return user;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/test")
	public String test(Model model){
		System.out.println("controller invoke");
		model.addAttribute("message", "world");
		return "hello/test";
	}
	//i feel good bd pq is different
	
}
