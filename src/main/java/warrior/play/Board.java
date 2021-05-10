package play;

import java.util.*;
import square.*;
import tool.*;
import enemy.*;


public class Board {

	// ATTRIBUTES
	private int numberOfSquares;
	private int beginningSquare;
	private ArrayList<Square> tabBoard;

	// METHODS

	// CONSTRUCTOR
	public Board() {
		this.numberOfSquares = 64;
		this.beginningSquare = 0;
		this.tabBoard = new ArrayList<Square>();
		
		//empty
		this.tabBoard.add(0, new Empty());
		this.tabBoard.add(1, new Lightning());
		this.tabBoard.add(2, new Club());
		this.tabBoard.add(3, new Goblin());
		this.tabBoard.add(4, new Lightning());
		this.tabBoard.add(5, new Club());
		this.tabBoard.add(6, new Goblin());
		this.tabBoard.add(7, new StandardPotion());
		this.tabBoard.add(8, new Lightning());
		this.tabBoard.add(9, new Goblin());
		this.tabBoard.add(10, new Sorcerer());
		this.tabBoard.add(11, new Club());
		this.tabBoard.add(12, new Goblin());
		this.tabBoard.add(13, new StandardPotion());
		this.tabBoard.add(14, new Empty());
		this.tabBoard.add(15, new Goblin());
		this.tabBoard.add(16, new Empty());
		this.tabBoard.add(17, new Lightning());
		this.tabBoard.add(18, new Goblin());
		this.tabBoard.add(19, new Sword());
		this.tabBoard.add(20, new Sorcerer());
		this.tabBoard.add(21, new Goblin());
		this.tabBoard.add(22, new Club());
		this.tabBoard.add(23, new Lightning());
		this.tabBoard.add(24, new Goblin());
		this.tabBoard.add(25, new Sorcerer());
		this.tabBoard.add(26, new Sword());
		this.tabBoard.add(27, new Goblin());
		this.tabBoard.add(28, new LargePotion());
		this.tabBoard.add(29, new Empty());
		this.tabBoard.add(30, new Goblin());
		this.tabBoard.add(31, new StandardPotion());
		this.tabBoard.add(32, new Sorcerer());
		this.tabBoard.add(33, new StandardPotion());
		this.tabBoard.add(34, new Empty());
		this.tabBoard.add(35, new Sorcerer());
		this.tabBoard.add(36, new Sorcerer());
		this.tabBoard.add(37, new Sorcerer());
		this.tabBoard.add(38, new Club());
		this.tabBoard.add(39, new StandardPotion());
		this.tabBoard.add(40, new Sorcerer());
		this.tabBoard.add(41, new LargePotion());
		this.tabBoard.add(42, new Sword());
		this.tabBoard.add(43, new StandardPotion());
		this.tabBoard.add(44, new Sorcerer());
		this.tabBoard.add(45, new Dragon());
		this.tabBoard.add(46, new Empty());
		this.tabBoard.add(47, new Sorcerer());
		this.tabBoard.add(48, new Fireball());
		this.tabBoard.add(49, new Fireball());
		this.tabBoard.add(50, new Empty());
		this.tabBoard.add(51, new Empty());
		this.tabBoard.add(52, new Dragon());
		this.tabBoard.add(53, new Sword());
		this.tabBoard.add(54, new Empty());
		this.tabBoard.add(55, new Empty());
		this.tabBoard.add(56, new Dragon());
		this.tabBoard.add(57, new Empty());
		this.tabBoard.add(58, new Empty());
		this.tabBoard.add(59, new Empty());
		this.tabBoard.add(60, new Empty());
		this.tabBoard.add(61, new Empty());
		this.tabBoard.add(62, new Dragon());
		this.tabBoard.add(63, new Empty());
		this.tabBoard.add(64, new Empty());
		
		//Randomized the board
		Collections.shuffle(tabBoard);
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
