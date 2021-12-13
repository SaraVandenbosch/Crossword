package Squares;

import java.awt.Color;

public class WhiteSquare extends Square{
	private String character = null;

	public WhiteSquare(Color white) {
		super(white);
	}
	
	public String getCharacter() {
		return character;
	}
	
	public void setCharacter(String newCharacter) {
		this.character = newCharacter;
	}

	@Override
	public boolean isEmpty() {
		if (character != null){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean isChangeable() {
		return true;
	}
	

}
