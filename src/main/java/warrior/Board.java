
import java.util.ArrayList;

public class Board {

	// ATTRIBUTES
	private int numberOfSquares = 4;
	private int beginningSquare = 1;
	private ArrayList<Square> tabBoard = new ArrayList<Square>();

	// METHODS

	// CONSTRUCTOR
	public Board() {
		this.numberOfSquares = numberOfSquares;
		this.beginningSquare = beginningSquare;
		this.tabBoard.add(new Empty());
		this.tabBoard.add(new Enemy());
		this.tabBoard.add(new AttackTool());
		this.tabBoard.add(new DefenseTool());

	};

	// SPECIFIC METHODS
	/*
	public void setSquareInTabBoard(Square square) {
		this.tabBoard.add( square)
	 }
	 */

	// GETTERS

	public int getNumberOfSquare() {
		return this.numberOfSquares;
	}

	public int getBeginningSquare() {
		return this.beginningSquare;
	}
	
	public Square getSquareInTabBoard(int index) {
		return tabBoard.get(index);
	}
	
	
	
	
	/*
	 * public String getTabBoard() { return ArrayList.toString(tabBoard); }
	 */

	// SETTERS

	public void setNumberOfSquares(int numberOfSquares) {
		this.numberOfSquares = numberOfSquares;
	}

	public void setBeginningSquare(int beginningSquare) {
		this.beginningSquare = beginningSquare;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Board [numberOfSquares=" + numberOfSquares + ", beginningSquare=" + beginningSquare + ", tabBoard="
				+ ArrayList.toString(tabBoard) + "]";
	}

}
