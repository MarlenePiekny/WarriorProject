
import java.util.Scanner;

//GAME START

public class Game {

	// ATTRIBUTES
	private Character character;
	private Board board = new Board();
	private Dice dice = new Dice();
	private Scanner keyboard;

	// METHODS

	// CONSTRUCTOR
	public Game(Character playingCharacter) {
		this.character = playingCharacter;
		this.board = new Board();
		this.dice = new Dice();
	}

	// SPECIFIC METHODS

	public Character startGame() {
		
		keyboard = new Scanner(System.in);
		
		// Place the character on the first square
		character.onBoard(board);
		board.putCharacterInBoard(character);

		// Remind to the character his/her place on the board
		System.out.println(character.getName());
		System.out.println("Square " + character.getBoardSquare() + " / " + board.getNumberOfSquare());

		while (character.getBoardSquare() < board.getNumberOfSquare()) {

			// display the board
			System.out.println(board.getTabBoard());

			// Ask the character to throw the dice
			System.out.println("Enter dice to continue to play or exit to leave the game");
			String inputCharacterInGame = keyboard.nextLine();

			switch (inputCharacterInGame) {
			case "dice":
				// Throw the dice
				System.out.println("You throw the dice");
				int diceResult = dice.throwDice();

				System.out.println("Dice result : " + diceResult);

				// Remove the character from his/her current square
				board.removeCharacterInBoard(character);

				// Move the character to the appropriated square

				if (character.getBoardSquare() + diceResult > board.getNumberOfSquare()) {
					// take the character to the end of the board
					character.setBoardSquare(board.getNumberOfSquare());

				} else {
					// move the character with the dice result
					character.moveOnBoard(diceResult);
				}

				// Display the square of the character
				System.out.println("Square " + character.getBoardSquare() + " / " + board.getNumberOfSquare());

				// Actualization of the board
				board.putCharacterInBoard(character);
				break;
			case "exit":
				Menu.endGame();
				break;
			default:
				System.out.println("This word doesn't match the choices");
			}

		}
		return character;
	}
}
