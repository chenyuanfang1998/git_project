package nnxy.cyf.service;

import nnxy.cyf.dao.UserDao;
import nnxy.cyf.user.User;

public class UserService {
	
	public UserDao dao=new UserDao();
	public void createUser(User user) {
		dao.add(user);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
