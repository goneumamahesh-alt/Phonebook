package com.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.entity.User;

import conn.com.DbConnect;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {

	    String email = req.getParameter("email");
	    String pass = req.getParameter("password");

	    HttpSession session = req.getSession();

	    try {
	        Connection con = DbConnect.getConn();

	        UserDAO dao = new UserDAO(con);
	        User u = dao.loginUser(email, pass);

	        if (u != null) {
	            session.setAttribute("user", u);
	            resp.sendRedirect("index.jsp");
	        } else {
	            session.setAttribute("invalidMsg", "Invalid Email or Password");
	            resp.sendRedirect("login.jsp");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        session.setAttribute("errorMsg", "Unexpected error");
	        resp.sendRedirect("login.jsp");
	    }
	}
}