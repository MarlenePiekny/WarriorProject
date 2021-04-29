import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Welcome in the Warrior game");
		
		String inputGame = "continu";
		
		
		while (inputGame == "continu")  {
			System.out.println("Do you want to continu? Enter continu");
			System.out.println("Do you want to leave? Enter exit");
			inputGame = keyboard.nextLine();
		}
	
	}

} 