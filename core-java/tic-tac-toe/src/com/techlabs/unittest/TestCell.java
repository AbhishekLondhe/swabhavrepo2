package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.MarkType;

public class TestCell {

	@Test
	public void checkCellValueCorrectOrNot() {
	Cell cell=new Cell();
	cell.setCellValue(MarkType.X);
	MarkType actual=cell.getCellValue();
	MarkType expected=MarkType.X;
	assertEquals(expected,actual);
	}
	
	@Test
	public void checkValueIsEmptyInitially() {
		Cell cell=new Cell();
		cell.setCellValue(MarkType.EMPTY);
		MarkType actual=cell.getCellValue();
		MarkType expected=MarkType.EMPTY;
		assertEquals(expected,actual);
	}
	@Test
	public void checkValueIsAlreadyMarked() {
		Cell cell=new Cell();
		cell.setCellValue(MarkType.X);
		Boolean actual =cell.checkValueIsAlreadyMarked();
		Boolean expected =true;
		assertEquals(expected,actual);
	}
}
