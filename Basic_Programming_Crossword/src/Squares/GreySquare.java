package Squares;

import java.awt.Color;

public class GreySquare extends Square{
	private String character = null;
	private String solution;

	public GreySquare(Color grey, String solution) {
		super(grey);
		this.solution = solution;
	}
	
	public String getCharacter() {
		return character;
	}
	
	public void setCharacter(String newCharacter) {
		this.character = newCharacter;
	}
	
	public String getSolution() {
		return solution;
	}
	
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
	public boolean isCorrect() {
		if(character.equals(solution)) {
			return true;
		}
		else {
			return false;
		}
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
