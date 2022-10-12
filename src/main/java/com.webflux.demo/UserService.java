package com.webflux.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService{
	@Autowired
	private UserRepository userRepository;

	public Flux<UserDetails> findAll() {
		return userRepository.findAll();
	}

	public Mono<UserDetails> findById(final String id) {
		return userRepository.findById(id);
	}

	public Mono<UserDetails> save(final UserDetails user) {
		return userRepository.save(user);
	}
}