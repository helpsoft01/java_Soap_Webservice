package com.mkyong.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.mekymong.entity.complexUser;
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
	@WebResult

	public user[] getListUsers() {

		ArrayList<user> lstUsers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			user user = new user(i, "name: " + String.valueOf(i), new Date());
			lstUsers.add(user);
		}

		return lstUsers.toArray(new user[lstUsers.size()]);
	}

	@Override
	public complexUser getComplexUser() {

		ArrayList<user> lstUsers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			user user = new user(i, "name: " + String.valueOf(i), new Date());
			lstUsers.add(user);
		}

		complexUser cpU = new complexUser("Full Name", lstUsers.toArray(new user[lstUsers.size()]));
		return null;
	}
}