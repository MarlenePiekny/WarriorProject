package warrior.play;

import java.util.*;
import warrior.square.*;
import warrior.tool.*;
import warrior.enemy.*;


public class Board {

	// ATTRIBUTES
	private int numberOfSquares;
	private int beginningSquare;
	private ArrayList<Square> tabBoard;

	// METHODS

	// CONSTRUCTOR
	public Board() {
		this.numberOfSquares = 65;
		this.beginningSquare = 0;
		this.tabBoard = new ArrayList<Square>();
		this.tabBoard.add(new Empty());
		this.tabBoard.add(new Dragon());
		this.tabBoard.add(new LargePotion());
		this.tabBoard.add(new Sword());
		this.tabBoard.add(new Club());
		this.tabBoard.add(new Goblin());
		this.tabBoard.add(new Fireball());
		this.tabBoard.add(new Lightning());
		this.tabBoard.add(new Sorcerer());
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
	
	public ArrayList<Square> getTabBoard() {
		return tabBoard;
	}
	 

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
				+ tabBoard + "]";
	}
	

}
