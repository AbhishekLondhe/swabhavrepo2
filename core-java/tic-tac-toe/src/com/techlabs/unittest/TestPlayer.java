package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;


public class TestPlayer {

	@Test
	public void checkingPlayerMarkIsCorrectOrNot(){

		Player player=new Player("abc",MarkType.X);
		MarkType actual=player.getMark();
		MarkType expected =MarkType.X;
		assertEquals(expected,actual);
	}
}
