package com.educandoweb.springemongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springemongo.domain.User;
import com.educandoweb.springemongo.dto.UserDTO;
import com.educandoweb.springemongo.repository.UserRepository;
import com.educandoweb.springemongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();		
	}
	
	public User findById(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto com o ID não encontrado"));
	}
	
	public User insert(User user) {
		return userRepository.insert(user);
	}
	
	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
	}
	
}
