package eTicaret.busines.concretes;

import eTicaret.busines.abstracts.EmailVeriyService;
import eTicaret.entities.concretes.User;

public class EmailVerifyManager implements EmailVeriyService{

	@Override
	public void sendCode(User user) {
		System.out.println("imailinz doðrulandý kodunuz bu :213213");
		
	}
	

}
