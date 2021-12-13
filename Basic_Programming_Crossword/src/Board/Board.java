package Board;

import Squares.Square;

public class Board {
	private int length;
	private int width;
	Square[] squaresOnBord;
	
	public Board(int length, int width, Square[] squaresOnBord) {
		this.length = length;
		this.width = width;
		this.squaresOnBord = squaresOnBord;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public Square[] getSquaresOnBord(){
		return squaresOnBord;
	}
	
	

}
