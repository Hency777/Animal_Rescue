/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal_rescue;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hency sethi
 */
public class showVol extends JFrame implements ActionListener{
     JTable j1;
    JButton b1;
    String h[]={"Phnone no.","Name","Email","Age","Area of Operation"};
    String d[][]=new String[20][8];  
    int i=0,j=0;
    
    showVol(){
        super("View Volunteers");
        
        setSize(1000,400);
        setLocation(200,200);

        try{
            String q="select * from volunteer";
           
             String url= "jdbc:mysql://localhost:3306/animals";
              String uname="root";
              String pass="";
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,uname,pass);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(q);
            
            while(rs.next()){
                // i = 0 j = 0
                d[i][j++]=rs.getString("phone");
                d[i][j++]=rs.getString("name");
                d[i][j++]=rs.getString("email");
                d[i][j++]=rs.getString("age");
                d[i][j++]=rs.getString("area");
                
               
                i++;
                j=0;
            }
            j1=new JTable(d,h); 

        }
        catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
           j1.print();
        }catch(Exception e){}
    }
     
    public static void main(String s[]){
        new showVol().setVisible(true);
    }
}

