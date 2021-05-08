package eTicaret;

import eTicaret.busines.abstracts.UserService;
import eTicaret.busines.concretes.EmailVerifyManager;
import eTicaret.busines.concretes.UserManager;
import eTicaret.busines.concretes.VerifyManager;
import eTicaret.dataAccess.concretes.HibernateUserDao;
import eTicaret.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Main {

	

	public static void main(String[] args) {
/*		
		User user = new User();
		user.setEmail("okanerguvan@gmail.com");
		user.setName("okan");
		user.setPassword("21321443534");
		user.setLastName("erguvan");
		user.setId(1);
	*/	User user0= new User(1, "ömer", "asdasd", "omers@gmail.com", "12345678");  
		User user1= new User(1, "Gokham", "Ergv", "1234@gmail.com", "1234567678");   
		User user2= new User(2,"Okan","Ergv","42345@gmail.com","12123133");     
		User user3= new User(3,"Go","Ergv","email","123456789");     
		User user4= new User(4,"gokhan","Ergvn","1234@gmail.com","142344");   
		User user6= new User(4,"gokhan","Ergvn","1234@gmail.com","142344");  
		User user5= new User(5,"Okan","vgrE","*203","122342332");       
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user5);
		users.add(user4);
		users.add(user6);
		
		
		
		
/*
		String s= "okan_erguvan@gmail.com";
		Pattern pattern=Pattern.compile("([a-zA-Z09\\_])+\\@([a-zA-Z])+\\.([a-zA-Z]{2,3})");
		Matcher matcher = pattern.matcher(s);
		
		
		boolean i=matcher.find();
		
		if (i == true ) {
			System.out.println("geçerli email");
		}
	*/

		VerifyManager verifyManager=new VerifyManager(new HibernateUserDao(),new EmailVerifyManager());
		verifyManager.email(user4, users);
	}
}
		
		



