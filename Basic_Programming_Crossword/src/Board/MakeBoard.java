package Board;

import java.util.ArrayList;
import java.util.List;

import Squares.Square;

public class MakeBoard {
	
	private List<Square> squaresOnBord = new ArrayList<>();
	
	public Square[] getSquaresOnBord(){
		Square[] arraySquaresOnBord = new Square[squaresOnBord.size()];
		return squaresOnBord.toArray(arraySquaresOnBord);
	}
	
	public void addSquareToBoard(Square square) {
		squaresOnBord.add(square);
	}
	
	public void removeSquareFromBoard(Square square) {
		squaresOnBord.remove(square);
	}

}
