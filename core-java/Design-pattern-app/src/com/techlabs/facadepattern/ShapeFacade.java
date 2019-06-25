package com.techlabs.facadepattern;

public class ShapeFacade {

	private IShape circle;
	private IShape rectangle;
	private IShape square;
	public ShapeFacade() {
		circle=new Circle();
		rectangle=new Rectangle();
		square=new Square();
	}
	public void  drawCircle() {
		circle.draw();
	} 
	public void  drawRectangle() {
		rectangle.draw();
	} 
	public void  drawSquare() {
		square.draw();
	} 
}
