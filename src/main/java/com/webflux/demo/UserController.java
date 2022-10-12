package com.webflux.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webflux.demo.UserDetails;
import com.webflux.demo.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")

public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping
    public Flux<UserDetails> getAllUser() {
        return userService.findAll();
    }
	
	@PostMapping
    public Mono<UserDetails> createUser( @RequestBody UserDetails user) {
        return userService.save(user);
    }

	@GetMapping("/{id}")
    public Mono<UserDetails> getUserById(@PathVariable(value = "id") String userId) {
        return userService.findById(userId);
    }
}
