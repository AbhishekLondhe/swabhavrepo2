package com.techlabs.tictactoetest;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TestTicTacToe {


	public static void main(String arggs[]) {
		Board board=new Board();
		Player player[] =new Player[2];
		ResultAnalyzer result=new ResultAnalyzer(board);
		player[0]=new Player("abc",MarkType.X);
		player[1]=new Player("def",MarkType.O);
		Game game=new Game(board,player,result);
		game.play(0);
		game.play(3);
		game.play(2);
		game.play(4);
		game.play(1);
		game.play(6);
		game.play(5);
		game.play(8);
		game.play(7);
		System.out.println("game status:"+game.getGameStatus());
	}
}
