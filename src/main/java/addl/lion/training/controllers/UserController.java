package addl.lion.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import addl.lion.training.domain.User;
import addl.lion.training.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/all")
	public List<User> allUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/all")
	public User newUser(@RequestBody User newUser) {
		return userService.addUser(newUser);
	}

}
