package addl.lion.training.service;

import java.util.List;

import addl.lion.training.domain.User;

public interface UserService {
	
	public User addUser(User u);
	
	public List<User> getAllUsers();

}
