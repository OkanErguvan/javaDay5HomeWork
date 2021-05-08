package eTicaret.core.concretes;

import eTicaret.core.abstracts.AuthService;
import eTicaret.entities.concretes.User;
import eTicaret.googleAuth.AuthManager;

public class AuthManagerAdaptor implements AuthService {
	
	
	AuthManager authManager;
	
	
	public AuthManagerAdaptor(AuthManager authManager) {
		super();
		this.authManager = authManager;
	}


	@Override
	public void sigIn(User user) {
		this.authManager.google(user);
		
	}

}
