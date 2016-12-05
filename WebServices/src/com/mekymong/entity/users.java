package com.mekymong.entity;

import java.util.List;

import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "users")
public class users {

	@XmlElement(name="users")
	List<user> users;

	public users() {

	}

	public List<user> getUsers() {
		return users;
	}

	public void setUsers(List<user> users) {
		this.users = users;
	}

}
