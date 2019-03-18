package com.gz.mbuy.smm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gz.mbuy.smm.dao.AdminDao;
@WebServlet(urlPatterns="/admin/login")
public class LoingServlet extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		
		String username=request.getParameter("a");
		String userpass=request.getParameter("b");
		HttpSession session=request.getSession();
		session.setAttribute("name", username);
		
		
		if(new AdminDao().login(username, userpass)){
			
			response.sendRedirect(basePath+"jsp/admin/main.html");
		}else{
			
			response.sendRedirect(basePath+"jsp/admin/login.jsp");
		}
		
		
	
	}

}
