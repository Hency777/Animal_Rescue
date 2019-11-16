/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal_rescue;

import java.sql.*;
/**
 *
 * @author hency sethi
 */
public class connection {
    public static void main(String args[]) throws Exception
    {
    String url= "jdbc:mysql://localhost:3306/animals";
    String uname="root";
    String pass="";
    
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded");
    Connection con=DriverManager.getConnection(url,uname,pass);
    System.out.println("Connection Established");
    Statement st=con.createStatement();
    //ResultSet rs=st.executeQuery();
    
    //rs.next();
    //String name =rs.getString("username");
    //System.out.println(name);
    
    st.close();
    con.close();
    }
}
