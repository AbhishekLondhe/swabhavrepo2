package com.techlabs.jframe.twobuttons;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowFrame extends JFrame {

	private JButton red, blue;
	private CommonObserver observer=new CommonObserver(this);
	public WindowFrame() {

		red = new JButton("red");	
		red.addActionListener(observer);
		add(red);

		blue = new JButton("blue");
		blue.addActionListener(observer);
		add(blue);

		setLayout(new FlowLayout());
		setSize(765, 800);
		setTitle("windowFrame");
		setVisible(true);

	}
	
	public JButton getRedButton() {
		return red;
	}
	public JButton getBlueButton() {
		return blue;
	}
}
