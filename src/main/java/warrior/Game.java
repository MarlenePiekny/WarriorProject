
import java.util.Scanner;

//GAME START

public class Game {

	// ATTRIBUTES
	private Board board = new Board();
	private Dice dice = new Dice();
	private Scanner keyboard = new Scanner(System.in); ;
	private Menu menu = new Menu();
	private Character character;
	private int characterSquare = 1; //in our case called with character.getBoardSquare()

	// METHODS

	// CONSTRUCTOR
	public Game(Character playingCharacter) {
		this.board = board;
		this.dice = dice;
		this.keyboard = keyboard;
		this.menu = menu;
		this.character = playingCharacter;
		this.characterSquare = characterSquare;
	}

	// SPECIFIC METHODS

	public Character startGame() {


		// Place the character on the first square
		character.onBoard(board);
		//putCharacterToTheBeginning(character);

		// Remind to the character his/her place on the board
		System.out.println(character.getName());
		System.out.println("Square " + characterSquare + " / " + board.getNumberOfSquare());

		while (characterSquare < board.getNumberOfSquare()) {

			turnToPlay(character);
		}
		return character;
	}

	public Character turnToPlay(Character character) {
		// display the board
		//System.out.println(board.getTabBoard());

		// Ask the character to throw the dice
		System.out.println("Enter dice to continue to play or exit to leave the game");
		String inputCharacterInGame = keyboard.nextLine();

		switch (inputCharacterInGame) {
		case "dice":
			// Throw the dice
			System.out.println("You throw the dice");
			int diceResult = dice.throwTrickDie();
			System.out.println("Dice result : " + diceResult);

			// Remove the character from his/her current square


			// Move the character to the appropriated square

			try {

				// the character will remain on the game board, move the character with the dice result
				character.moveOnBoard(diceResult);
				
				characterSquare = moveCharacterOnBoard(diceResult);

				

			} catch (CharacterOvertakeGameBoardException e) {

				System.out.println(e.getMessage());

				// the character will overtake the game board, move the character to the end of
				// the game board
				character.setBoardSquare(board.getNumberOfSquare());
				characterSquare = board.getNumberOfSquare();

				// Actualization of the board
				//moveCharacterToTheEnd(character); TO DELETE IF WORKING
			}

			// Display the square of the character
			System.out.println("Square " + characterSquare + " / " + board.getNumberOfSquare());
			
			//Check what is in the square
			

			break;
		case "exit":
			menu.endGame();
			break;
		default:
			System.out.println("This word doesn't match the choices");
		}
		return character;
	}
	
	// METHOD TO MOVE THE CHARACTER ON THE BOARD
	
		public int moveCharacterOnBoard(int diceResult) throws CharacterOvertakeGameBoardException {
			if (characterSquare + diceResult > board.getNumberOfSquare()) {
				throw new CharacterOvertakeGameBoardException();
			} else {
				//board.setValueInTabBoard(characterSquare, character.getName() );
				characterSquare += diceResult;
			}
		return characterSquare;
		}
	
	
		/*
		public void putCharacterToTheBeginning(Character character) {
			board.setValueInTabBoard(board.getBeginningSquare(), character.getName() );
		}

		public void putCharacterInBoard(Character character) throws CharacterOvertakeGameBoardException {
			if (character.getBoardSquare() > board.getNumberOfSquare()) {
				throw new CharacterOvertakeGameBoardException();
			} else {
				board.setValueInTabBoard(character.getBoardSquare(), character.getName() );
			}
			
		}

		public void removeCharacterInBoard(Character character) {
			board.setValueInTabBoard(character.getBoardSquare(),  null);
		}
		
		public void moveCharacterToTheEnd(Character character) {
			board.setValueInTabBoard(board.getNumberOfSquare(), character.getName() );
		}
		*/
	
}
