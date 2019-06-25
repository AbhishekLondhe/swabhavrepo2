package com.techlabs.loginjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{

	JLabel nameLabel,pwdLabel;
	JTextField userTextField;
	JButton loginBtn;
	JPasswordField pwdTextField;
	 public LoginFrame() {

	  nameLabel = new JLabel("Username");
	  nameLabel.setBounds(80, 70, 200, 30);
	  this.add(nameLabel);

	  pwdLabel = new JLabel("Password");
	  pwdLabel.setBounds(80, 110, 200, 30);
	  this.add(pwdLabel);
	  
	  userTextField = new JTextField();
	  userTextField.setBounds(300, 70, 200, 30);
	  this.add(userTextField);
	  
	  pwdTextField = new JPasswordField();
	  pwdTextField.setBounds(300, 110, 200, 30);
	  this.add(pwdTextField);
	  
	  loginBtn = new JButton("Login");
	  loginBtn.setBounds(150, 160, 75, 30);	 
	  loginBtn.addActionListener(this);
	  this.add(loginBtn);
	  
	  this.setSize(700, 500);
	  this.setLayout(null);
	  this.setVisible(true);
	 }
	 public void actionPerformed(ActionEvent ae)
	 {
	   String uname = userTextField.getText();
	   String pass = pwdTextField.getText();
	   if(uname.equals(pass))
	   {
	      WelcomeFrame wel = new WelcomeFrame();
	      wel.setVisible(true);
	      JLabel label = new JLabel("Welcome:"+uname);
	      label.setBounds(250, 60, 200, 30);
	      wel.getContentPane().add(label);
	    }
	    else
	    {
	      JOptionPane.showMessageDialog(this,"Incorrect username and password!!"); 
	    }
	  }
	 }
