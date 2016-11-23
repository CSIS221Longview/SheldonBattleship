/*Still in progress. Trying to figure out an efficient way to name/place ships and reduce code copying from my get(boards)
methods of the different board sizes.*/ 
import java.security.SecureRandom;

public class gameboard
{
	
	//The five different ships and their lengths.
	private static final int AIRCRAFT_CARRIER = 5;
	private static final int BATTLESHIP = 4;
	private static final int DESTROYER = 3;
	private static final int SUBMARINE = 3;
	private static final int PATROL = 2;
	
	//Array of ships
	private static final int[] SHIPS = {AIRCRAFT_CARRIER, BATTLESHIP, DESTROYER, SUBMARINE, PATROL};
	
	//variables
	private static String[][] beginner = new String[6][6]; //6x6 (beginner)
	private static String[][] standard = new String[9][9]; //9x9 (standard)
	private static String[][] advanced = new String[12][12]; //12x12 (advanced)
	private static SecureRandom rand = new SecureRandom();
	
	//constructor
	public gameboard(int[] SHIPS, String[][] beginner, String[][] standard, String[][] advanced)
	{
		this.beginner = beginner;
		this.standard = standard;
		this.advanced = advanced;
	}
	
	//ship names
	private String shipName()
	{
		
	}
	
	//create Beginner board
	public static void setBeginnerBoard()
	{
 	 for (int r = 0; r < beginner.length; r++)
		{
			for (int c = 0; c < beginner[0].length; c++)
			{	
				beginner[r][c] = "~ ";
				System.out.print(beginner[r][c]);
			}
			System.out.println();
		}
	}
	
	//get Beginner board 
	public String[][] getBeginnerBoard()
	{
		return beginner;
	}
	
	//create Standard board
	public static void setStandardBoard()
	{
		for (int r = 0; r < standard.length; r++)
		{
			for (int c = 0; c < standard[0].length; c++)
			{	
				standard[r][c] = "~ ";
				System.out.print(standard[r][c]);
			}
			System.out.println();
		}
	}
	
	
	//get Standard board
	public String[][] getStandardBoard()
	{
		return standard;
	}
	
	//create Advanced board
	public static void setAdvancedBoard()
	{
		for (int r = 0; r < advanced.length; r++)
		{
			for (int c = 0; c < advanced[0].length; c++)
			{	
				advanced[r][c] = "~ ";
				System.out.print(advanced[r][c]);
			}
			System.out.println();
		}
	}
	
	//get Advanced board
	public String[][] getAdvancedBoard()
	{
		return advanced;
	}

	//select difficulty level (beginner, standard, or advanced)
	public boolean difficultyLevel()
	{
	}
	
	//Randomly place ships on grid
	public placeShips()
	{
	}
}
