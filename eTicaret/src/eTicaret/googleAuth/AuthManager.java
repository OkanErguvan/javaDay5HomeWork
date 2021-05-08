package eTicaret.googleAuth;

import eTicaret.entities.concretes.User;

public class AuthManager {

	public void google(User user) {
		System.out.println("googla ile giriþ yapýldý : "+user.getEmail());
	}
}
