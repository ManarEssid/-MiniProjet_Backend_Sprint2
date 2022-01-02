package com.manar.users;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.manar.users.entities.Role;
import com.manar.users.entities.User;
import com.manar.users.service.UserService;



@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService ;
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
	
	
	/*
	@PostConstruct
	void init_users() {
	userService.saveUser(new User(null,"manar","essid",true,null));
	userService.addRoleToUser("manar", "USER");}

		// ajouter les rÃ´les
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));
		
		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "nadhem", "123", true, null));

		userService.saveUser(new User(null, "yassine", "123", true, null));
		// ajouter les rÃ´les aux users
		
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("nadhem", "USER");
		userService.addRoleToUser("yassine", "USER");
	}
*/
	@Bean
	BCryptPasswordEncoder getBCE() {
	return new BCryptPasswordEncoder();
	}
}
