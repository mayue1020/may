package com.may.login;

public class Login {
	public boolean login(String userName,String passWord){
		boolean a =false;
		String pwd = "123";
		String unm = "123";
		if (pwd.equals(passWord) && unm.equals(userName)){
			a = true;
		}
		return a;
	}
}
