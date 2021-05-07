package play;

import java.util.Scanner;
import character.*;
import exception.*;
import square.*;
import tool.*;

//GAME START

public class Game {

	// ATTRIBUTES
	private Board board;
	private Dice dice;
	private Scanner keyboard;
	private Menu menu;
	private Perso perso;
	private int persoSquare;

	// METHODS

	// CONSTRUCTOR
	public Game(Perso playingPerso) {
		this.board  = new Board();
		this.dice = new Dice();
		this.keyboard  = new Scanner(System.in);
		this.menu = new Menu();
		this.perso = playingPerso;
		this.persoSquare = 0;
	}

	// SPECIFIC METHODS

	public Perso startGame() {


		// Place the perso on the first square
		perso.onBoard(board);
		//putPersoToTheBeginning(perso);

		// Remind to the perso his/her place on the board
		System.out.println(perso.getName());
		System.out.println("Square " + persoSquare + " / " + board.getNumberOfSquare());
		
		System.out.println("Tableau" + board.getTabBoard());

		while (persoSquare < board.getNumberOfSquare()) {

			turnToPlay(perso);
		}
		System.out.println("Congrats " + perso.getName() + " you have completed the Warrior and Wizard game");
		
		return perso;
	}

	public Perso turnToPlay(Perso perso) {
		
		// display the board
		//System.out.println(board.getTabBoard());

		// Ask the perso to throw the dice
		System.out.println("Enter dice to continue to play or exit to leave the game");
		String inputPersoInGame = keyboard.nextLine();

		switch (inputPersoInGame) {
		case "dice":
			// Throw the dice
			System.out.println("You throw the dice");
			int diceResult = dice.throwTrickDie();
			System.out.println("Dice result : " + diceResult);		

			try {
				// the perso will remain on the game board, move the perso with the dice result
				perso.moveOnBoard(diceResult);
				// Move the perso to the appropriated square
				persoSquare = movePersoOnBoard(diceResult);
				

			} catch (PersoOvertakeGameBoardException e) {

				System.out.println(e.getMessage());

				// the perso will overtake the game board, move the perso to the end of the game board
				perso.setBoardSquare(board.getNumberOfSquare());
				// Move the perso to the appropriated square
				persoSquare = board.getNumberOfSquare();
				
			}
			

			// Display the number of the square where the perso is
			System.out.println("Square " + persoSquare + " / " + board.getNumberOfSquare());
			
			//Check what is in the square
			Square square = board.getSquareInTabBoard(persoSquare);
			System.out.println( square.toString() );
			System.out.println( square.displaySquareInformations() );
			
			if (square instanceof Empty) {
				//The square is empty, nothing happen
				nothingHappens();
				
				
			} else if (square instanceof Enemy ) {
				//The square contains an enemy, you fight with it
				fightWith();
				
				
			} else if (square instanceof Surprise ) {
				//The square contains a surprise
				getEquippedWithTool();
				
				
			} else {
				System.out.println("Aouch, this case shouldn't happen");
				
				
			}
			
			

			break;
		case "exit":
			menu.endGame();
			break;
		default:
			System.out.println("This word doesn't match the choices");
		}
		return perso;
	}
	
		// METHOD TO MOVE THE CHARACTER ON THE BOARD
	
		public int movePersoOnBoard(int diceResult) throws PersoOvertakeGameBoardException {
			if (persoSquare + diceResult > board.getNumberOfSquare()) {
				throw new PersoOvertakeGameBoardException();
			} else {
				//board.setValueInTabBoard(persoSquare, perso.getName() );
				persoSquare += diceResult;
			}
		return persoSquare;
		}
		
		
		//METHOD TO DO NOTHING WHEN EMPTY SQUARE
		public void nothingHappens() {
			System.out.println("Everything is fine, nothing happens");
		}
		
		//METHOD TO FIGHT WITH AN ENEMY
		public void fightWith() {
			System.out.println("You fight with an enemy");
		}
		
		//METHOD TO EQUIP THE PERSO IN A SURPRISE SQUARE
		public void getEquippedWithTool() {
			System.out.println("You get equiped with a tool");
		}
	
		/*
		public void putPersoToTheBeginning(Perso perso) {
			board.setValueInTabBoard(board.getBeginningSquare(), character.getName() );
		}

		public void putPersoInBoard(Perso perso) throws PersoOvertakeGameBoardException {
			if (perso.getBoardSquare() > board.getNumberOfSquare()) {
				throw new PersoOvertakeGameBoardException();
			} else {
				board.setValueInTabBoard(perso.getBoardSquare(), perso.getName() );
			}
			
		}

		public void removePersoInBoard(Perso perso) {
			board.setValueInTabBoard(perso.getBoardSquare(),  null);
		}
		
		public void movePersoToTheEnd(Perso perso) {
			board.setValueInTabBoard(board.getNumberOfSquare(), perso.getName() );
		}
		*/
	
}
