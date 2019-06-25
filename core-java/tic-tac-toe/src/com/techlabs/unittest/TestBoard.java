package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.MarkType;

public class TestBoard {

	@Test
	public void checkBoardValueCorrectOrNot() {
		Board board=new Board();
		board.setBoardPosition(4,MarkType.X);
		MarkType actual=board.getBoardPosition(4);
		MarkType expected=MarkType.X;
		assertEquals(expected,actual);
	}
	@Test
	public void checkBoardOutOfIndexOrNot() {
		Board board=new Board();
		boolean actual=board.checkPositionVailidity(9);
		boolean expected=false;
		assertEquals(expected,actual);
	}
	
	@Test
	public void checkBoardIsfullOrNot() {
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
		boolean actual=board.checkBoardIsFullOrNot();
		boolean expected=true;
		assertEquals(expected,actual);
	}
}
