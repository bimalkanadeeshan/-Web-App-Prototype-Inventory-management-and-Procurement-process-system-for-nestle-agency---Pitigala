package io.javabrains.springbootstarterweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.javabrains.springbootstarterweb.Model.User;
import io.javabrains.springbootstarterweb.Services.UserService;

@Controller
public class RestController {
    
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@GetMapping("/")
	public String hello() {
		return "This is Home Page";
	}
	@ResponseBody
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String password) {
		User user = new User(username,firstname,lastname,age,password);
		userService.saveMyUser(user);
		return "User Saved";
	}
}
