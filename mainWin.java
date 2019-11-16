/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal_rescue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hency sethi
 */

  
public class mainWin extends JFrame implements ActionListener{
       
    mainWin(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/Animal-Rescue.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
    
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("Animals");
        m1.setForeground(Color.blue);
    
        JMenuItem t1 = new JMenuItem("Add an Animal");
    
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/addnew.png")));
        
        

    
        JMenuItem t2 = new JMenuItem("Search");
        t2.setForeground(Color.blue);
        t2.setFont(new Font("monospaced",Font.PLAIN,12));
        t2.setMnemonic('S');
        t2.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/search.png")));
        t2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
    
    
        JMenuItem t3= new JMenuItem("Delete Animal");
    
        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('E');
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/delete.png")));
    
        JMenuItem t4 = new JMenuItem("Show All");
      
        t4.setForeground(Color.blue);
        t4.setFont(new Font("monospaced",Font.PLAIN,12));
        t4.setMnemonic('T');
        t4.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/newinvoice.png")));
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
    
    
    
    
        m1.add(t1);
        m1.add(t2);
        m1.add(t3);
        m1.add(t4);
        mb.add(m1);
    
       t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
        
        
        
        JMenu rep =new JMenu("Volunteer");
        rep.setForeground(Color.blue);
    
        mb.add(rep);
        JMenuItem p1 = new JMenuItem("Add New");
   
    
        p1.setForeground(Color.blue);
        p1.setFont(new Font("monospaced",Font.PLAIN,12));
        p1.setMnemonic('P');
        p1.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/payments.png")));
        p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        rep.add(p1);
        JMenuItem p2 = new JMenuItem("Show All Volunteer");
   
        p2.setForeground(Color.blue);
        p2.setFont(new Font("monospaced",Font.PLAIN,12));
        p2.setMnemonic('L');
        p2.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/empreport.png")));
        p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

        rep.add(p2);
        p1.addActionListener(this);
       p2.addActionListener(this);

       
        JMenu m8=new JMenu("Exit");
        m8.setForeground(Color.red);
        mb.add(m8);
        JMenuItem m8i1=new JMenuItem("Exit");
        m8.add(m8i1);
        m8i1.setForeground((Color.blue));
        m8i1.setFont(new Font("monospaced", Font.PLAIN, 14));
        m8i1.setMnemonic('X');
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("animal_rescue/icon/exit.PNG")));
        m8i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
       // m8i1.addActionListener(this);

    }
    
   public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
      
        if(msg.equals("Add an Animal"))
             new addAnimal().setVisible(true);
            
       else if(msg.equals("Search"))
                
        new searchanimal().setVisible(true);
       
     
        else if(msg.equals("Delete Animal"))
            new NewJFrame1().setVisible(true);
           // new delAnimal().setVisible(true);
                 
            
        else if(msg.equals("Show All"))
                new showAll().setVisible(true);
                
        else if(msg.equals("Add New"))
            new NewJFrame().setVisible(true);
         //  new addVol().setVisible(true); 
            
        else if(msg.equals("Show All Volunteer"))
             new showVol().setVisible(true);    
           
        
        else if(msg.equals("Exit"))
            System.exit(0);
        
    }
    
   
       public static void main(String[] args)
       {
        new mainWin().setVisible(true);
    }
    

}
