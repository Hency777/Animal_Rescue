/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal_rescue;

/**
 *
 * @author hency sethi
 */


import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


                              
 public class searchanimal extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2; 
    
    
    searchanimal(){
        
        super("searchanimal");
        
        setSize(600,650);
        setLocation(400,70);
        getContentPane().setBackground(Color.WHITE);
        JPanel p1= new JPanel(new GridBagLayout());
        
        
        
        GridBagConstraints c = new GridBagConstraints();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("   Serial Number");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
        b1=new JButton("Search");
        b1.addActionListener(this);
        c.gridx = 3;
        c.gridy =3;
        
        p1.add(b1,c);
        
        
       
        l2 = new JLabel("   Category");
        t2 = new JTextField(25);
        c.gridx = 1;
        c.gridy =3;
        p1.add(l2,c);
        p1.add(t2);
       
        l3 = new JLabel("   Place Found");
        t3 = new JTextField(25);
        p1.add(l3);
        p1.add(t3);
        
        l4 = new JLabel("   Medical Treatment");
        t4 = new JTextField(25);
        p1.add(l4);
       p1.add(t4); 
       
       
        l5 = new JLabel("   Attendant Name");
        t5 = new JTextField(25);
        p1.add(l5);
        p1.add(t5);
        
        l6 = new JLabel("   Date(DD/MM/YY)");
        t6 = new JTextField(25);
        p1.add(l6);
        p1.add(t6);
        
       
// b1 =new JButton("Submit");

        b2 = new JButton("Cancel");
      p1.add(b1);
        p1.add(b2);
       
        setLayout(new BorderLayout());
       //add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("animal_rescue"))),"West");
        add(p1,"Center");
       
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
       
        
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       
    }
    
   
    
    
    
    public void actionPerformed(ActionEvent ae){
        Function f = new Function();
        ResultSet rs = null;
         String ct,mt,pf,an,ad;
            rs=f.find(t1.getText());
            
          //  q="select * from animal where serial="+sn;
           // ResultSet rs=st.executeQuery(q);
           try{
            if(rs.next())
            {  
                pf=rs.getString("place");
                mt=rs.getString("medt");
                ct=rs.getString("categry");
                an=rs.getString("aname");
                ad=rs.getString("adate");
            t2.setText(ct);
            t3.setText(pf);
            t4.setText(mt);
            t5.setText(an);
            t6.setText(ad);
            }
            else
                 JOptionPane.showMessageDialog(null,"NO DATA FOR THIS ID");
           }
           catch(Exception ex)
           {
                JOptionPane.showMessageDialog(null,ex.getMessage());
           }
       }
    
      public class Function{
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        public ResultSet find(String s){
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/animals","root","");
                ps = con.prepareStatement("select * from animal where serial= ?");
                ps.setString(1,s);
                rs = ps.executeQuery();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return rs;
        }
        
       
          
    }
    public static void main(String s[]){
        new searchanimal().setVisible(true);
        
    }

}


