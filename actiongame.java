/*This file will be running the game.*/

import java.util.Scanner;

public class actiongame
{
	gameboard board = new gameboard();
	Scanner input = new Scanner(System.in);
	
	
	// Variables
	boolean win = false;
	
	
	// Intro to the Game.
	public void menuIntro()
	{
		System.out.println("  **********************************");
		System.out.println("  *      ********************      *");
		System.out.println("  *      STAR WARS BATTLESHIP!     *");
		System.out.println("  *      ********************      *");
		System.out.println("  **********************************");
		System.out.println("\nSelect your difficulty Level\n");
		System.out.println("  **********************************");
		System.out.println("1 - Jedi PADAWAN - 6x6 - 30 Missiles");
		System.out.println("2 - Jedi KNIGHT  - 9x9 - 50 Missiles");
		System.out.println("3 - Jedi MASTER - 12x12 - 75 Missiles");
		System.out.println("  **********************************");
		System.out.printf("\nChoose your difficulty (1-3): ");
	}
	
	// Player guess Ship locations
	public guess()
	{
		//TO DO
	}
}
