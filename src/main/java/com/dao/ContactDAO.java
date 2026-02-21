package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Contact;

public class ContactDAO {

    private Connection conn;

    public ContactDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean saveContact(Contact c) {
        String sql = "INSERT INTO contact(name, email, phone, about) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getName());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getPhno());
            ps.setString(4, c.getAbout());

            return ps.executeUpdate() == 1;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // Get All Contacts
    public List<Contact> getAllContacts() {

        System.out.println("[ContactDAO] Starting getAllContacts()...");

        List<Contact> list = new ArrayList<>();
        String sql = "SELECT * FROM contact";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            System.out.println("[ContactDAO] Executing SQL: " + sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Contact c = new Contact();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setEmail(rs.getString("email"));
                c.setPhno(rs.getString("phone"));
                c.setAbout(rs.getString("about"));

                System.out.println("[ContactDAO] Retrieved Contact → "
                        + "ID: " + c.getId()
                        + ", Name: " + c.getName()
                        + ", Email: " + c.getEmail()
                        + ", Phone: " + c.getPhno()
                        + ", About: " + c.getAbout()
                );

                list.add(c);
            }

            System.out.println("[ContactDAO] Total contacts fetched: " + list.size());

        } catch (Exception e) {
            System.out.println("[ContactDAO] ERROR while fetching contacts!");
            e.printStackTrace();
        }

        System.out.println("[ContactDAO] Returning contacts list...\n");
        return list;
    }


}
