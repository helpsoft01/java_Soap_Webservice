package com.mkyong.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.mekymong.entity.users;
import com.mekymong.entity.user;

//Service Implementation Bean

@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}

	@Override
	public user getUser() {
		// TODO Auto-generated method stub
		user u = new user(1, "Mot", new Date());
		u.setBirth(new Date());

		return u;
	}

	@Override
	public List<user> getListUsers() {

		List<user> lstUsers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			user user = new user(i, "name: " + String.valueOf(i), new Date());
			lstUsers.add(user);
		}

		users lu = new users();
		lu.setUsers(lstUsers);
		return lu.getUsers();
	}
}