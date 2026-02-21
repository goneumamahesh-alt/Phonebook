package com.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ContactDAO;
import com.entity.Contact;

import conn.com.DbConnect;
@WebServlet("/addContact")
public class AddContact extends HttpServlet {
protected void doPost(HttpServletRequest req,HttpServletResponse resp)
throws ServletException,IOException{
String name=req.getParameter("name");
String email=req.getParameter("email");
String phno=req.getParameter("phone");
String about=req.getParameter("about");
Contact c=new Contact();
c.setName(name);
c.setEmail(email);
c.setPhno(phno);
c.setAbout(about);
ContactDAO dao=new ContactDAO(DbConnect.getConn());
boolean saved=dao.saveContact(c);
resp.sendRedirect("addContact.jsp");
}
}