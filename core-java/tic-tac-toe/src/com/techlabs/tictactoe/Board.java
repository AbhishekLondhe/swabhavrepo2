package com.techlabs.tictactoe;

public class Board {
	private MarkType mark;
	Cell cells[]=new Cell[9];
	public Board() {
		for(int i=0;i<9;i++) {
			cells[i]=new Cell();
		}
	}
	
	public void setBoardPosition(int position,MarkType mark) {
		//adjustIndex(position);
		if(checkPositionVailidity(position)==true)
			cells[position].setCellValue(mark);
	}
	public boolean checkPositionVailidity(int newPosition) {
		if(newPosition >= 0 && newPosition<=8)
			return true;
		return false;
	}
	
	public MarkType getBoardPosition(int position) {
		//adjustIndex(position);
		return cells[position].getCellValue();
	}
	
	/*public int adjustIndex(int position) {
		return position - 1;
	}*/
	
	public boolean checkBoardIsFullOrNot() {
		for(int i=0;i<9;i++) {
			if(cells[i].getCellValue()!=MarkType.EMPTY)
				continue;
			else
				return false;
		}
		return true;
	}
	
}
