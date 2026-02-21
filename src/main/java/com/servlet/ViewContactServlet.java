package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ContactDAO;
import com.entity.Contact;

import conn.com.DbConnect;

@WebServlet("/viewContact")
public class ViewContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("\n========== ViewContactServlet START ==========");

        // DB Connection
        System.out.println("[Servlet] Getting DB Connection...");
        var conn = DbConnect.getConn();
        System.out.println("[Servlet] DB Connection: " + conn);

        // DAO call
        System.out.println("[Servlet] Calling DAO.getAllContacts()...");
        ContactDAO dao = new ContactDAO(conn);
        List<Contact> list = dao.getAllContacts();

        // Check results
        if (list == null) {
            System.out.println("[Servlet] ERROR: DAO returned NULL list!");
        } else {
            System.out.println("[Servlet] Contacts fetched: " + list.size());
        }

        // Setting attribute
        System.out.println("[Servlet] Setting request attribute: contactList");

        req.setAttribute("contactList", list);

        // Forward to JSP
        System.out.println("[Servlet] Forwarding to: viewContact.jsp");
        req.getRequestDispatcher("viewContact.jsp").forward(req, resp);

        System.out.println("========== ViewContactServlet END ==========\n");
    }
}
