/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal_rescue;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hency sethi
 */


//public class addAnimal extends javax.swing.JFrame {

    /**
     * Creates new form addAnimal
     */
  /*  public addAnimal() {
        initComponents();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/animals","root","");
            Statement st=con.createStatement();
            String q,sn,ct,plc,mt,an,ad;
            sn=t1.getText();
            ct=t4.getText();
            plc=t2.getText();
            mt=t3.getText();
            an=t5.getText();
            ad=t6.getText();
            q="insert into animal values(" +sn+",'"+ct+"','"+plc+"','"+mt+"','"+an+"','"+ad+"')";
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "saved");

        }
        catch(Exception e)
        {
JOptionPane.showMessageDialog(null, e.toString());
        }
    }                                        
 */
public class addAnimal extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
   
    
    addAnimal(){
        
        super("addAnimal");
        
        setSize(600,650);
        setLocation(400,70);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
       
    p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("   Serial Number");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
        b1=new JButton("Submit");
        b1.addActionListener(this);
        
       
        
        p1.add(b1);
        
        
       
        l2 = new JLabel("   Category");
        t2 = new JTextField(25);
        p1.add(l2);
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
       
        String qry,sn,ct,plc,mt,an,ad;
            sn=t1.getText();
            ct=t2.getText();
            plc=t3.getText();
            mt=t4.getText();
            an=t5.getText();
            ad=t6.getText();
       
        //String qry = "insert into animal values(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";
       
        try{
             Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/animals";
            String uname="root";
            String pass="";
             Connection con=DriverManager.getConnection(url,uname,pass);
             Statement st=con.createStatement();
             
              qry="insert into animal values(" +sn+",'"+ct+"','"+plc+"','"+mt+"','"+an+"','"+ad+"')";
            st.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "saved");

        }
        catch(Exception e)
        {
JOptionPane.showMessageDialog(null, e.toString());

        } 
            
            /* if (t1.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Name Field is empty");
    } else  if(t3.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Address is empty");
    }
             else  if(t3.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Address is empty");
    }
             
        }   catch(Exception ee){
            ee.printStackTrace();
        }
     
        */
         
          
    }
    
    public static void main(String s[]){
        new addAnimal().setVisible(true);
        
    }

}
 
