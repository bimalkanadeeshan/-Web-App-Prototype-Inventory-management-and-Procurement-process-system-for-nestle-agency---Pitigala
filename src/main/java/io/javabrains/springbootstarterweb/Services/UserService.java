package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarterweb.Model.User;
import io.javabrains.springbootstarterweb.Repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
    	this.userRepository =userRepository;
    }
    
	public void saveMyUser(User user) {
		userRepository.save(user);
	} 
}
