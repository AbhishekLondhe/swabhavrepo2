package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.ResultAnalyzer;
import com.techlabs.tictactoe.ResultType;

public class TestResultAnalyzer {


	
	@Test
	public void checkResultIsCorrectOrNot() {
		Board board=new Board();
		board.setBoardPosition(0, MarkType.X);
		board.setBoardPosition(1, MarkType.O);
		board.setBoardPosition(2, MarkType.X);
		board.setBoardPosition(3, MarkType.X);
		board.setBoardPosition(4, MarkType.O);
		board.setBoardPosition(5, MarkType.X);
		board.setBoardPosition(6, MarkType.O);
		board.setBoardPosition(7, MarkType.X);
		board.setBoardPosition(8, MarkType.O);
		ResultType actual=new ResultAnalyzer(board).checkIfWonOrNot(MarkType.X);
		ResultType expected =ResultType.DRAW;
		assertEquals(expected,actual);
	}
	
	
}
