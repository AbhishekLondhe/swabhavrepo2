package com.techlabs.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;
import com.techlabs.tictactoe.ResultType;

public class ButtonIconSwitch implements ActionListener {

	private Game game;
	private Board board;
	private ResultAnalyzer resultAnalyzer;
	private Player player[];
	private String pName;
	private LoginFrame loginFrame;
	private MainFrame mainFrame;
	private int counter = 0;
	private String firstName, secondName;

	public ButtonIconSwitch(MainFrame mainFrame, String firstName, String secondName) {
		this.mainFrame = mainFrame;
		board = new Board();
		resultAnalyzer = new ResultAnalyzer(board);
		player = new Player[2];
		player[0] = new Player(firstName, MarkType.X);
		player[1] = new Player(secondName, MarkType.O);
		game = new Game(board, player, resultAnalyzer);
		this.firstName = firstName;
		this.secondName = secondName;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mainFrame.getOne()) {
			mainFrame.getOne().setText(changeToMark());
			counter++;
			game.play(0);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getOne().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getTwo()) {
			mainFrame.getTwo().setText(changeToMark());
			counter++;
			game.play(1);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getTwo().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getThree()) {
			mainFrame.getThree().setText(changeToMark());
			counter++;
			game.play(2);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getThree().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getFour()) {
			mainFrame.getFour().setText(changeToMark());
			counter++;
			game.play(3);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getFour().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getFive()) {
			mainFrame.getFive().setText(changeToMark());
			counter++;
			game.play(4);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getFive().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getSix()) {
			mainFrame.getSix().setText(changeToMark());
			counter++;
			game.play(5);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getSix().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getSeven()) {
			mainFrame.getSeven().setText(changeToMark());
			counter++;
			game.play(6);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getSeven().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getEight()) {
			mainFrame.getEight().setText(changeToMark());
			counter++;
			game.play(7);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getEight().setEnabled(false);
			Winner();
		}
		if (e.getSource() == mainFrame.getNine()) {
			mainFrame.getNine().setText(changeToMark());
			counter++;
			game.play(8);
			mainFrame.getStatus().setText("status:"+game.getGameStatus());
			mainFrame.getNine().setEnabled(false);
			Winner();
		}
	}

	public String changeToMark() {
		if (counter % 2 == 0) {
			mainFrame.getPlayerName().setText("Player:"+secondName);
			mainFrame.getMark().setText("Mark O");
			return "X";
		}
		mainFrame.getPlayerName().setText("Player:"+firstName);
		mainFrame.getMark().setText("Mark X");
		return "O";
	}
	
	public void Winner() {
		if(game.getGameStatus()==ResultType.WIN)
			mainFrame.getStatus().setText(mainFrame.getPlayerName().getText()+"("+mainFrame.getMark().getText()+")"+"WIN");
	}
}
