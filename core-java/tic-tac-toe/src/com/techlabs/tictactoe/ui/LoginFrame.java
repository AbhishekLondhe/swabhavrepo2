package com.techlabs.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{

	JLabel firstLabel,secondLabel;
	JTextField firstTextField, secondTextField;
	JButton loginBtn;
	 public LoginFrame() {

	  firstLabel = new JLabel("first player name:");
	  firstLabel.setBounds(80, 70, 200, 30);
	  this.add(firstLabel);

	  secondLabel = new JLabel("second Player name:");
	  secondLabel.setBounds(80, 110, 200, 30);
	  this.add(secondLabel);
	  
	  firstTextField = new JTextField();
	  firstTextField.setBounds(300, 70, 200, 30);
	  this.add(firstTextField);
	  
	  secondTextField = new JTextField();
	  secondTextField.setBounds(300, 110, 200, 30);
	  this.add(secondTextField);
	  
	  loginBtn = new JButton("Play");
	  loginBtn.setBounds(150, 160, 75, 30);	 
	  loginBtn.addActionListener(this);
	  this.add(loginBtn);
	  
	  this.setSize(700, 500);
	  this.setLayout(null);
	  this.setVisible(true);
	 }
	 public void actionPerformed(ActionEvent ae)
	 {
	   String firstName = firstTextField.getText();
	   String secondName = secondTextField.getText();
	   if(!firstName.equalsIgnoreCase(secondName)) {
	      MainFrame mainFrame = new MainFrame(firstName,secondName);
	      mainFrame.setVisible(true);
	  }
	   else {
		   JOptionPane.showMessageDialog(this,"Both Player name is same!!");   
	   }
	   }
	 }
