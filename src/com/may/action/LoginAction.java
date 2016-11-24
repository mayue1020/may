package com.may.action;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.may.login.*;

public class LoginAction {
	private Login login = new Login(); 
	public String excute(HttpServletRequest request,HttpServletResponse response){
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		boolean b;
		b = login.login(userName, passWord);
		if(b){
			request.setAttribute("userName", userName);
			return "login_success.jsp";
		}
		else{
			request.setAttribute("passWord", passWord);
			return "login_error.jsp";
		}
	}
}