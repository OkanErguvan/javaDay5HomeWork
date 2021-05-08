package eTicaret.busines.abstracts;

import eTicaret.entities.concretes.User;

public interface EmailVeriyService {
	void sendCode(User user);

}
