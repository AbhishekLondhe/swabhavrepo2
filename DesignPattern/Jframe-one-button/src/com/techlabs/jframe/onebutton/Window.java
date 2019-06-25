package com.techlabs.jframe.onebutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Window extends JFrame implements ActionListener{

	JButton source;
	List<IObserver> observers;
	public Window() {
		
		source=new JButton("Source");
		source.addActionListener(this);
		add(source);
		
		setLayout(new FlowLayout());
		setSize(765, 800);
		setTitle("window");
		setVisible(true);
		observers=new ArrayList<IObserver>();
	}
	
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
	
	public List<IObserver> getObservers() {
		return observers;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==source) {
			notifyObserver(source);
		}
	}
	public void notifyObserver(JButton b) {
		for(IObserver ib:observers) {
			ib.update();
		}
	}
}
