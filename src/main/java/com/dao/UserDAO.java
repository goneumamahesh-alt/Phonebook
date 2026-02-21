package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.entity.User;
public class UserDAO {
private Connection conn;
public UserDAO(Connection conn) {
this.conn=conn;
}
public User loginUser(String email,String pass) {
String sql="select id,name,email,password from users where email=? and password=?";
try(PreparedStatement ps=conn.prepareStatement(sql)){
ps.setString(1,email);
ps.setString(2,pass);
try(ResultSet rs=ps.executeQuery()){
if(rs.next()) {
User user=new User();
user.setId(rs.getInt("id"));
user.setName(rs.getString("name"));
user.setEmail(rs.getString("email"));
user.setPassword(rs.getString("password"));
return user;
}
}
}catch(Exception e) {
e.printStackTrace();
}
return null;
}
}