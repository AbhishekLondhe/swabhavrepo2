package com.techlabs.tictactoe;

public class ResultAnalyzer {
	
	private MarkType mark;
	private Board board;
	
	public ResultAnalyzer(Board board) {
		this.board=board;
	}
	public Board getBoard() {
		return board;
	}
	
	public ResultType checkIfWonOrNot(MarkType mark) {
		if(board.cells[0].getCellValue()==mark && board.cells[1].getCellValue()==mark 
				&& board.cells[2].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[3].getCellValue()==mark && board.cells[4].getCellValue()==mark 
				&& board.cells[5].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[6].getCellValue()==mark && board.cells[7].getCellValue()==mark 
				&& board.cells[8].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[0].getCellValue()==mark && board.cells[3].getCellValue()==mark 
				&& board.cells[6].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[1].getCellValue()==mark && board.cells[4].getCellValue()==mark 
				&& board.cells[7].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[2].getCellValue()==mark && board.cells[5].getCellValue()==mark 
				&& board.cells[8].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[0].getCellValue()==mark && board.cells[4].getCellValue()==mark 
				&& board.cells[8].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.cells[2].getCellValue()==mark && board.cells[4].getCellValue()==mark 
				&& board.cells[6].getCellValue()==mark) {
			return ResultType.WIN;
		}
		if(board.checkBoardIsFullOrNot()==true) {
			return ResultType.DRAW;
		}
		return ResultType.ON_GOING;
	}
	
}
