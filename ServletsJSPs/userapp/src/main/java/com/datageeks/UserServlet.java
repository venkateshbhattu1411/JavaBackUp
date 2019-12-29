package com.datageeks;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.datageeks.dao.User;
import com.datageeks.service.ServicesException;
import com.datageeks.service.UserService;

public class UserServlet  extends HttpServlet{
	private UserService service = new UserService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			List<User> userList = service.getAll();
			HttpSession session = req.getSession();
			session.setAttribute("userList", userList);
			resp.sendRedirect("./welcome.jsp");
		} catch (ServicesException e) {
			resp.sendRedirect("./error.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
