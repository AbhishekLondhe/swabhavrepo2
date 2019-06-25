package com.techlabs.thread.synchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Synchronous extends JFrame implements ActionListener {

	private JButton alert, print;

	public Synchronous() {
		alert = new JButton("Alert");
		print = new JButton("Print");

		add(alert);
		add(print);

		alert.addActionListener(this);
		print.addActionListener(this);
		
		setLayout(new FlowLayout());
		setSize(400, 400);
		setTitle("Thread");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == alert) {
			JOptionPane.showMessageDialog(this, "Hello");
		}

		if (e.getSource() == print) {
			while(true) {
				while (true) {
					Date date = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
					String currentTime = formatter.format(date);
					System.out.println(currentTime);
				}
			}
		}
	}

}
