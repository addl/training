package addl.lion.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import addl.lion.training.domain.User;
import addl.lion.training.persistence.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User u) {
		UserServiceImpl.log.info("Adding user {}", u);
		return this.userRepository.save(u);
	}

	@Override
	public List<User> getAllUsers() {
		UserServiceImpl.log.info("Fetching all users");
		List<User> result = new ArrayList<User>();
		this.userRepository.findAll().forEach(result::add);
		return result;
	}

}
