package Squares;

import java.awt.Color;

public class BlackSquare extends Square{

	public BlackSquare(Color black) {
		super(black);
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public boolean isChangeable() {
		return false;
	}
	
	

}
