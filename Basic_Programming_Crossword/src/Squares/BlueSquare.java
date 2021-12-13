package Squares;

import java.awt.Color;

public class BlueSquare extends Square{
	private String character = null;
	private String correctCharacter;

	public BlueSquare(Color blue, String correctCharacter) {
		super(blue);
		this.correctCharacter = correctCharacter;
	}
	
	public String getCharacter() {
		return character;
	}
	
	public void setCharacter(String newCharacter) {
		this.character = newCharacter;
	}
	
	public String getCorrectCharacter() {
		return correctCharacter;
	}
	
	public void setCorrectCharacter(String correctCharacter) { 
		this.correctCharacter = correctCharacter;
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
