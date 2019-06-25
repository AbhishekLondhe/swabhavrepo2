package com.techlabs.tictactoe;

public class Game {

	private Board board;
	private Player player[] = new Player[2];
	private ResultAnalyzer result;
	private int playerIndex = 0;
	private ResultType gameStatus;
	
	public Game(Board board, Player player[], ResultAnalyzer result) {
		this.board = board;
		this.player = player;
		this.result = result;
	}

	public Board getBoard() {
		return board;
	}

	public Player[] getPlayer() {
		return player;
	}

	public ResultAnalyzer getResult() {
		return result;
	}

	public int getPlayerIndex() {
		return playerIndex;
	}
	public ResultType getGameStatus() {
		return gameStatus;
	}
	public void play(int position) {
		
		board.setBoardPosition(position, player[playerIndex].getMark());
		gameStatus=result.checkIfWonOrNot(player[playerIndex].getMark());
		if(playerIndex==0) {
			playerIndex=1;
			return;
		}
		if(playerIndex==1) {
			playerIndex=0;
			return;
		}
	}
}
