package eTicaret.busines.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaret.busines.abstracts.EmailVeriyService;
import eTicaret.busines.abstracts.VerifyService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class VerifyManager implements VerifyService{
	private UserDao userDao;
	private EmailVeriyService emailVeriyService;
	
	public VerifyManager(UserDao userDao,EmailVeriyService emailVeriyService) {
		super();
		this.userDao=userDao;
		this.emailVeriyService=emailVeriyService;
	}
		
	@Override
	public void email(User user, List<User> users) {
		Pattern pattern =Pattern.compile("([a-zA-Z0-9\\_])+\\@([a-zA-Z])+\\.([a-zA-Z]{2,3})");
		Matcher matcher=pattern.matcher(user.getEmail());
		boolean i;
		i=matcher.find();
		if (i==true) {
			for(User _user:users)
			if(_user.getEmail().equals(user.getEmail())) {
				System.out.println("bu e posta kullanýlýyor." + user.getEmail());
				return;
				}else {
					System.out.println("eposta kaydý baþarýlý.");
					this.emailVeriyService.sendCode(user);
				}
			
			
			
		}else {
			return;
		}
		
	}

	@Override
	public void password(User user) {
		if(user.getPassword().length()<7) {
			System.out.println("eksik karakter girdiniz");
			return;
		}else {
			System.out.println("baþarýlý");
		}
		
	}

	@Override
	public void name(User user) {
		if(user.getName().length()<3) {
			System.out.println("eksik karakter girdiniz.");
		return;
		}else {
			System.out.println("giriþ baþarýlý.");
		}
		
	}

}
