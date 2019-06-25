package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TestGame {

	@Test
	public void checkSwitchingPlayerIndexOrNot() {
		Board board=new Board();
		Player player[] =new Player[2];
		ResultAnalyzer result=new ResultAnalyzer(board);
		player[0]=new Player("abc",MarkType.X);
		player[1]=new Player("def",MarkType.O);
		Game game=new Game(board,player,result);
		game.play(1);
		game.play(2);
		int actual=game.getPlayerIndex();
		int expected=0;
		assertEquals(expected,actual);
	}
}
