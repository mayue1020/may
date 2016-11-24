package com.may.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.may.action.LoginAction;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginAction login=new LoginAction();
		response.sendRedirect(login.excute(request, response));//跳转到登陆成功页面
		HttpSession s=request.getSession();
		
		System.out.println(s+","+s.getSessionContext()+","+s.getId()+","+s.getCreationTime()+","+s.toString());
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
//		
//		LoginAction login=new LoginAction();
//			System.out.println("666");
//			response.sendRedirect(login.excute(request, response));//跳转到登陆成功页面
		
		
	}
}
