package eTicaret.dataAccess.concretes;

import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user,List<User> users) {
		System.out.println("Kullanýcý eklendi : "+user.getName());
		users.add(user);
		
	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email(User user) {
		System.out.println("Hibernate ile eklendi : "+user.getEmail());
		
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

}
