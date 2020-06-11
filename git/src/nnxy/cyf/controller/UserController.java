package nnxy.cyf.controller;

import nnxy.cyf.service.UserService;
import nnxy.cyf.user.User;

public class UserController {
	public UserService service=new UserService();
	public void addUser(User user) {
		service.createUser(user);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
