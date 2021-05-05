

import java.util.Arrays;

public class Board {

	// ATTRIBUTES
	private int numberOfSquares = 64;
	private int beginningSquare = 1;
	private String tabBoard[] = new String[numberOfSquares + 1];
	
	// METHODS

	// CONSTRUCTOR
	public Board() {
		this.numberOfSquares = numberOfSquares;
		this.beginningSquare = beginningSquare;
		this.tabBoard = tabBoard;
	};

	//SPECIFIC METHODS
	
	public void setValueInTabBoard(int index, String valueToPutInBoard) {
		this.tabBoard[index] = valueToPutInBoard;
	}

	// GETTERS

	public int getNumberOfSquare() {
		return this.numberOfSquares;
	}

	public int getBeginningSquare() {
		return this.beginningSquare;
	}

	public String getTabBoard() {
		return Arrays.toString(tabBoard);
	}

	// SETTERS

	public void setNumberOfSquares(int numberOfSquares) {
		this.numberOfSquares = numberOfSquares;
	}

	public void setBeginningSquare(int beginningSquare) {
		this.beginningSquare = beginningSquare;
	}

	public void setTabBoard(String[] tabBoard) {
		this.tabBoard = tabBoard;
	}

	// TO STRING
	
	@Override
	public String toString() {
		return "Board [numberOfSquares=" + numberOfSquares + ", beginningSquare=" + beginningSquare + ", tabBoard="
				+ Arrays.toString(tabBoard) + "]";
	}

}
