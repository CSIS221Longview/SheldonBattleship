/*Still in progress. Trying to figure out an efficient way to place ships.*/ 
import java.util.Random;
import java.util.Scanner;

public class gameboard
{
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	// CONSTANTS
	//private final static int EMPTY_HIT = 6;
	//private final static int OCCUPIED = 7;
	//private final static int OCCUPIED_HIT = 8;
	
	// Array of ships
	initializeShips[] SHIPS = new initializeShips();
	
	// Array of Difficulty Levels/Missiles and the Board
	private int[] BEGINNER = {6, 30};
	private int[] STANDARD = {9, 50};
	private int[] ADVANCED = {12, 75};
	private int[][] BOARD;
	
	// Variables
	private int difficulty, size, missiles, hits, misses;
	private int shipsLeft = 5;
	private double accuracy; // Going to be hits / missiles fired (2 decimal places)
	
	// Get player's difficulty
	public void getDifficulty()
	{
		difficulty = input.nextInt();
		
		// Check for Valid input.
		while (difficulty != 1 && difficulty != 2 && difficulty != 3)
		{
			System.out.print("\nWhy would you enter something other than 1-3?\n"
					+ "\nChoose your difficulty(1-3): ");
			difficulty = input.nextInt();
		}
		
		//Set Difficulty
		switch(difficulty)
		{
			case 1:
			   System.out.println("\nPerhaps you are not as strong as the Emporer thought...\n");
			   size = BEGINNER[0];
			   missiles = BEGINNER[1];
			   break;
			case 2:
			   System.out.println("\nDo, or do not. There is no try.\n");
			   size = STANDARD[0];
			   missiles = STANDARD[1];
			  break;
			case 3:
			   System.out.println("\nThe Force is strong with this one.\n");
			   size = ADVANCED[0];
			   missiles = ADVANCED[1];
			   break;
		}
		
		setBoard();
	}
	
	// Initialize method for setting ships
	public class initializeShips
	{
		public String name = "";
		public String leter = "";
		public int length = 0;
		public int value = 0;
		
		public String getName()
		{
			return name;
		}
		
		public String getLetter()
		{
			return letter;
		}
		
		public int getLength()
		{
			return length;
		}
		
		public int getValue()
		{
			return value;
		}
	}
	
	//Set all SHIPS using initialize class (method inspiration from Nick)
	public void setShips()
	{
		SHIPS[0] = new initializeShips();
		SHIPS[1] = new initializeShips();
		SHIPS[2] = new initializeShips();
		SHIPS[3] = new initializeShips();
		SHIPS[4] = new initializeShips();
		
		SHIPS[0].name = "DEATH STAR";       // Aircraft Carrier name
		SHIPS[1].name = "MILLINEUM FALCON"; // Battleship name
		SHIPS[2].name = "STAR DESTROYER";   // Destroyer name
		SHIPS[3].name = "SITH INFILTRATOR"; // Submarine name
		SHIPS[4].name = "TIE FIGHTER";      // Patrol Boat name
		
		SHIPS[0].value = 5;
		SHIPS[1].value = 4;
		SHIPS[2].value = 4;
		SHIPS[3].value = 3;
		SHIPS[4].value = 2;
		
		SHIPS[0].letter = "A"; // Aircraft Carrier symbol - DEATH STAR
		SHIPS[1].letter = "B"; // Battleship symbol - MILLINEUM FALCON
		SHIPS[2].letter = "D"; // Destroyer symbol - STAR DESTROYER
		SHIPS[3].letter = "S"; // Submarine symbol - SITH INFILTRATOR
		SHIPS[4].letter = "P"; // Patrol boat symbol - TIE FIGHTER
		
		SHIPS[0].value = 1;
		SHIPS[1].value = 2;
		SHIPS[2].value = 3;
		SHIPS[3].value = 4;
		SHIPS[4].value = 5;
	}
	
	// Used to print Row letters on board (method inspiration from Adam)
	public char getRowLetters(int i)
	{
		return (char) (i + 64);
	}
	
	// Get size of board _x_
	public int getSize()
	{
		return this.size;
	}
	
	// Set board size.
	public void setBoard()
	{
		this.BOARD = new int [size][size];
	}
	
	// Get missile count
	public int getMissiles()
	{
		return this.missiles;
	}
	
	// Initialize board to empty.
	public void initializeBoard()
	{
		for (int row = 0; row < getSize(); row++)
		{
			for (int col = 0; col < getSize(); col++)
				BAORD[row][col] = -1;
		}
	}
	
	// Print the board
	public void printBoard()
	{
		char empty = '~';
		char miss = 'X';
		getDifficulty();
		initializeBoard();
		
		// Keep track of missiles, ships left, and accuracy.
		System.out.printf("BOARD SIZE = %d%x%d%nMISSILES LEFT = %d%nSHIPS LEFT = %d%n",//YOUR ACCURACY = %d%n",
			getSize(), getSize(),
			getMissiles(), this.shipsLeft);//, this.accuracy); Commented out for now until I figure out how to calculate accuracy.
		System.out.println();
		System.out.print("\n  ");
		
		// Print Column Numbers
		for (int i = 0; i < getSize(); i++)
			System.out.printf("%4d", i + 1);
		
		for (row = 0; row < getSize(); row++)
		{
			System.out.print("\n");
			
			// Print Row Letters
			System.out.printf("%3c", getRowLetters(row + 1));
			
			for (int col = 0; col < getSize(); col++)
			{
				if (BOARD[row][col] == -1)
					System.out.printf("%3c", empty);
				if (BOARD[row][col] == 0)
					System.out.printf("%3c", miss);
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	//Randomly place ships on grid
	public placeShips()
	{
		//TO DO
	}
}
