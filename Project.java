/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Project extends JFrame {
    
    
    
    JButton b = new JButton("ok");
    JButton b2 = new JButton("CHANGE ADMIN");
    JLabel l1=new JLabel("Enter Name: ");
    JTextField txt = new JTextField(30); 
    JLabel l2=new JLabel("Enter passward:");
    JTextField txt2= new JTextField(30);
    JMenu m1= new JMenu("file");
    JMenu m2= new JMenu("connections");
    JLabel l3=new JLabel("ADMIN LOGIN PORTAL");
     JPanel p =new JPanel();
        JPanel p1= new JPanel();
        JPanel p2 =new JPanel();
        JPanel p3 =new JPanel();
        JPanel p4 =new JPanel();
        JPanel p5 =new JPanel();
    
    public Project(){
        gui();
    }
    public void gui(){
        JFrame f = new JFrame();
        f.setTitle("Merit List");
        f.setVisible(true);
        f.setSize(600,400);
        
      //  f.setBounds(600,400 ,600 ,400);
      //  f.setLayout(new BorderLayout());
       f.setLayout(new FlowLayout(0,0,6));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
       
        JLabel imagelabel = new JLabel();
        imagelabel.setIcon(new ImageIcon("C:/Users/HP/Desktop/project/project/src/project/101.jpg"));
        
        p4.add(l3);
        p4.setLayout(new FlowLayout(100));
        p.add(l1);
        p.add(txt);
        p.setLayout(new FlowLayout(0,50,0));
        p1.setLayout(new FlowLayout(0,40,0));
        p1.add(l2);
        p1.add(txt2);
        p2.setLayout(new FlowLayout(0,30,0));
        p2.add(b);
        p2.add(b2);
        
        ActionListener al=new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String name=txt.getText();
                String pass=txt2.getText();
                if(name.equals("admin") && pass.equals("admin"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
        JOptionPane optionPane = new JOptionPane("Wrong Name and Passward", JOptionPane.ERROR_MESSAGE);    
        JDialog dialog = optionPane.createDialog("Failure");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
            //System.out.println("Authentication Failed");
        }
            }
        };
        
        b.addActionListener(al);
      //  p5.setLayout(new FlowLayout(0));
        //p5.add(b2);
        ActionListener a2=new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                f.setVisible(false);
                JFrame f2 = new JFrame();
                JLabel ll=new JLabel("Current name");
                JTextField tt1=new JTextField(20);
                JLabel ll2=new JLabel("Current passward");
                JTextField tt2=new JTextField(20);
                JLabel ll3=new JLabel("New name");
                JTextField tt3=new JTextField(20);
                JLabel ll4=new JLabel("New Passward");
                JTextField tt4=new JTextField(20);
                JButton bb=new JButton("OK");
                f2.setTitle("change admin");
                f2.setVisible(true);
                f2.setSize(300,300);
                f2.setLayout(new FlowLayout(0,50,0));
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f2.setLocationRelativeTo(null);
                f2.add(ll);
                f2.add(tt1);
                f2.add(ll2);
                f2.add(tt2);
                f2.add(ll3);
                f2.add(tt3);
                f2.add(ll4);
                f2.add(tt4);
                f2.add(bb);
                
               
                
                ActionListener a2=new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                f2.setVisible(false);
                new Project();
            }
                };
             bb.addActionListener(a2);
            }
        };
        b2.addActionListener(a2);
        p3.add(imagelabel);
        f.add(p4);
        f.add(p);
        f.add(p1);
        f.add(p2);
      //  f.add(p5);
        f.add(p3);
        
       

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Project p=new Project();
    }
    
}
