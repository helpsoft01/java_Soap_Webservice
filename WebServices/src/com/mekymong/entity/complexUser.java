package com.mekymong.entity;

import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class complexUser {

	@XmlElement
	String fullName;

	@XmlElement()
	user[] users;

	public complexUser() {

	}

	public complexUser(String fullName, user[] users) {

		setFullName(fullName);
		setUsers(users);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public user[] getUsers() {
		return users;
	}

	public void setUsers(user[] users) {
		this.users = users;
	}

}
