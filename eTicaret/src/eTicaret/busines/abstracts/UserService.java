package eTicaret.busines.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();

}
