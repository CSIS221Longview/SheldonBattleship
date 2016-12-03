/*This file will be running the game.*/

import java.util.Scanner;

public class actiongame
{
	gameboard board = new gameboard();
	Scanner input = new Scanner(System.in);
	
	
	// Variables
	boolean win = false;
	String name;
	
	// Run Game
	public void runGame()
	{
		menuIntro();
		board.printBoard();
		board.placeShips();
		playerGuess(); //Still in progress
		// To Do
	}
	
	// Get player name, just for fun.
	public String getName()
	{
		System.out.print("ENTER YOUR FIRST OR LAST NAME, JEDI: ");
		name = input.next();
		return this.name;
	}
	
	// Intro to the Game.
	public void menuIntro()
	{
		String playerName;	
		System.out.println("  **********************************");
		System.out.println("  *      ********************      *");
		System.out.println("  *      STAR WARS BATTLESHIP!     *");
		System.out.println("  *      ********************      *");
		System.out.println("  **********************************");
		playerName = getName().toUpperCase();
		System.out.println("\nDIFFICULTY LEVELS TO CHOOSE FROM, YOUNG " + playerName + "\n");
		System.out.println("************************************************");
		System.out.println("* 1 - Jedi PADAWAN " + playerName.toUpperCase() + " - 6x6 - 30 Missiles *");
		System.out.println("* 2 - Jedi KNIGHT " + playerName.toUpperCase() + " - 9x9 - 50 Missiles  *");
		System.out.println("* 3 - Jedi MASTER " + playerName.toUpperCase() + " - 12x12 - 75 Missiles*");
		System.out.println("************************************************");
		System.out.printf("\nNow, YOUNG " + playerName + ", Enter your difficulty (1-3): ");
	}
	
	//
	
	//player guess row
	public void playerGuess()
	{
		// Still in progress.
	}
