package eTicaret.busines.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface VerifyService {
	
	void email(User user , List<User> users);
	void password(User user);
	void name(User user);

}
