package com.techlabs.jframe.twobuttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CommonObserver implements ActionListener{

	private JButton btn;
	private WindowFrame frame;
	
	public CommonObserver(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button "+e.getActionCommand()+" clicked");
		if (e.getSource() == frame.getRedButton()) {
			System.out.println(frame.getRedButton());
			frame.getContentPane().setBackground(Color.RED);
		}
		if (e.getSource() == frame.getBlueButton()) {
			frame.getContentPane().setBackground(Color.BLUE);
		}
	}
}
