package com.techlabs.lsp.soln;

public class Square implements IShape{

	private int side;
	public Square(int side) {
		this.side=side;
	}
	
	public int getSide() {
		return side;
	}

	@Override
	public int calculateArea() {
		return side*side;
	}
	
}
