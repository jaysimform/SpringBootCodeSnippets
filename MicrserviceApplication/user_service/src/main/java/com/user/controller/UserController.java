package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
	return this.userService.getUser(userId);
	
	
/*	Note: the communication of the data between microservices is not getting possible because List and List<Contact>
  @RestController
	@RequestMapping("/user")
	public class UserController {


	    @Autowired
	    private UserService userService;

	    @Autowired
	    private RestTemplate restTemplate;

	    @GetMapping("/{userId}")
	    public User getUser(@PathVariable("userId") Long userId) {

	        User user = this.userService.getUser(userId);
	        //http://localhost:9002/contact/user/1311

	        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(), List.class);


	        user.setContacts(contacts);
	        return user;

	    }

	}*/
}
}
