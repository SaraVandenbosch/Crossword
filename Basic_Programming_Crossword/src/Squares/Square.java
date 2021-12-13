package Squares;

import java.awt.Color;

public abstract class Square {
	Color color;
	
	public Square(Color color) {
		this.color =color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract boolean isEmpty();
	
	public abstract boolean isChangeable();
	

}
