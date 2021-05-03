package warrior;

import java.util.Arrays;

public class Board {

	//ATTRIBUTES
	private int numberOfSquares = 64;
	private int beginningSquare = 1;
	private String tabBoard[] = new String [numberOfSquares + 1];


	//METHODS
	
	//CONSTRUCTOR
	public Board() {
		this.tabBoard = tabBoard;
	};
	
	//SPECIFIC METHODS
	
	public void putCharacterInBoard(Warrior character) { 
		this.tabBoard[character.getBoardSquare()] = character.getName();
	}
	

	public void removeCharacterInBoard(Warrior character) {
		this.tabBoard[character.getBoardSquare()] = null;
	}
	
	
	//GETTERS
	
	public int getNumberOfSquare() {
		return this.numberOfSquares;
	}
	
	public int getBeginningSquare() {
		return this.beginningSquare;
	}
	
	public String getTabBoard() {
		return Arrays.toString(tabBoard);
	}
	//SETTERS
	

	@Override
	public String toString() {
		return "Board [numberOfSquares=" + numberOfSquares + ", beginningSquare=" + beginningSquare + ", tabBoard="
				+ Arrays.toString(tabBoard) + "]";
	}
	
	
	
	
	//TO STRING
	
	
}	
