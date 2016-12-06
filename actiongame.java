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
	{//   
		return this.name;
	}//          
	
	// Intro to the Game.
	public void menuIntro()
	{	
		System.out.println("  **********************************");
		System.out.println("  *      ********************      *");
		System.out.println("  *      STAR WARS BATTLESHIP!     *");
		System.out.println("  *      ********************      *");
		System.out.println("  **********************************");
		System.out.print("ENTER YOUR FIRST OR LAST NAME, JEDI: ");
		name = input.next();
		name = getName();
		System.out.println("\nDIFFICULTY LEVELS TO CHOOSE FROM, YOUNG " + name + "\n");
		System.out.println("************************************************");
		System.out.println("* 1 - Jedi PADAWAN (Beginner)" + name.toUpperCase() + " - 6x6 - 30 Missiles *");
		System.out.println("* 2 - Jedi KNIGHT (Standard)" + name.toUpperCase() + " - 9x9 - 50 Missiles  *");
		System.out.println("* 3 - Jedi MASTER (Advanced)" + name.toUpperCase() + " - 12x12 - 75 Missiles*");
		System.out.println("************************************************");
		System.out.printf("\nNow, YOUNG " + name + ", Enter your difficulty (1-3): ");
	}
	
	//
	
	//player guess row
	public void playerGuess()
	{
		// Still in progress.
	}
