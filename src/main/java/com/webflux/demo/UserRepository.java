package com.webflux.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.webflux.demo.UserDetails;

import org.reactivestreams.Publisher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public class UserRepository implements ReactiveCrudRepository<UserDetails, String> {

	private final Map<String, UserDetails> userDetailsMap = new ConcurrentHashMap<>();

	public UserRepository() {
		userDetailsMap.put("1", new UserDetails("1", "Anbu", "anbu@gmail.com"));
		userDetailsMap.put("2", new UserDetails("2", "Akash", "akash@gmail.com"));
		userDetailsMap.put("3", new UserDetails("3", "Bunny", "bunny@gmail.com"));
		userDetailsMap.put("4", new UserDetails("4", "Avalan", "avalan@gmail.com"));
		userDetailsMap.put("5", new UserDetails("5", "Apsara", "apsara@gmail.com"));
	}
	
	public Flux<UserDetails> findAll() {
	  return Flux.fromIterable(userDetailsMap.values());
	}
	
	public Mono<UserDetails> findById(String s) {
	  return Mono.justOrEmpty(userDetailsMap.get(s));
	}
	public <S extends UserDetails> Mono<S> save(S user) {
        return null;
    }

	@Override
	public <S extends UserDetails> Flux<S> saveAll(Iterable<S> entities) {
		
		return null;
	}

	@Override
	public <S extends UserDetails> Flux<S> saveAll(Publisher<S> entityStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<UserDetails> findById(Publisher<String> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> existsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> existsById(Publisher<String> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<UserDetails> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<UserDetails> findAllById(Publisher<String> idStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Long> count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(Publisher<String> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(UserDetails entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll(Iterable<? extends UserDetails> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll(Publisher<? extends UserDetails> entityStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}
	  }

