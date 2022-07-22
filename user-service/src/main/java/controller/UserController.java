package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import VO.ResponseTemplateVO;
import entity.User;
import lombok.extern.slf4j.Slf4j;
import service.UserService;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		log.info("Inside saveUser, Controller ");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userId)
	{
		log.info("Inside getUserWithDepartment, Controller ");
		return userService.getUserWithDepartment(userId);
	}
	
}