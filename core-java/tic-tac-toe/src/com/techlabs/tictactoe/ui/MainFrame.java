package com.techlabs.tictactoe.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private JFrame frame;
	private JLabel status, playerName, mark;
	private JButton nine, one, two, three, four, five, six, seven, eight;
	private ButtonIconSwitch btnSwitch;

	public MainFrame(String firstPlayer,String secondPlayer) {
		btnSwitch = new ButtonIconSwitch(this,firstPlayer,secondPlayer);
		status = new JLabel("       Game Status");
		playerName = new JLabel("     PlayerName");
		mark = new JLabel("Mark");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");

		one.addActionListener(btnSwitch);
		two.addActionListener(btnSwitch);
		three.addActionListener(btnSwitch);
		four.addActionListener(btnSwitch);
		five.addActionListener(btnSwitch);
		six.addActionListener(btnSwitch);
		seven.addActionListener(btnSwitch);
		eight.addActionListener(btnSwitch);
		nine.addActionListener(btnSwitch);

		add(status);
		add(playerName);
		add(mark);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);

		setLayout(new GridLayout(4, 1));
		setSize(500, 600);
		setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JLabel getStatus() {
		return status;
	}

	public JLabel getPlayerName() {
		return playerName;
	}

	public JLabel getMark() {
		return mark;
	}

	public JButton getNine() {
		return nine;
	}

	public JButton getOne() {
		return one;
	}

	public JButton getTwo() {
		return two;
	}

	public JButton getThree() {
		return three;
	}

	public JButton getFour() {
		return four;
	}

	public JButton getFive() {
		return five;
	}

	public JButton getSix() {
		return six;
	}

	public JButton getSeven() {
		return seven;
	}

	public JButton getEight() {
		return eight;
	}

	public ButtonIconSwitch getBtnSwitch() {
		return btnSwitch;
	}
	
}
