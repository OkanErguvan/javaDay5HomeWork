package eTicaret.busines.concretes;

import java.util.List;

import eTicaret.busines.abstracts.UserService;
import eTicaret.core.abstracts.AuthService;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService,AuthService{

	
	@Override
	public void add(User user) {
		System.out.println("eklendiz");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("silindizin");
		
	}

	@Override
	public void update(User user) {
		System.out.println("güncellendi");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sigIn(User user) {
		
		
	}

}
