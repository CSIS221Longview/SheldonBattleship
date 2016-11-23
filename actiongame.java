/*This file will be running the game.*/

import java.util.Scanner;

public class actiongame
{	

	gameboard board = new gameboard(int[] SHIPS, String[][] beginner, String[][] standard, String[][] advanced);
	/*^^ why is this object giving me errors?????
  "Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Syntax error on token "]", :: expected after this token
	Duplicate field actiongame.String
	Syntax error on token "]", :: expected after this token
	Syntax error on token "]", :: expected after this token
	Duplicate field actiongame.String
	Syntax error on token "]", :: expected after this token
	Return type for the method is missing

	at actiongame.<init>(actiongame.java:8)
	at battleship.main(battleship.java:7)"*/
  
	Scanner input = new Scanner(System.in);
	
	//variables
	private boolean win = false;
	private int missileCount = 0;
	
	//constructor
	public actiongame(boolean win, int missileCount)
	{
		this.win = win;
		this.missileCount = missileCount;
	}
	
	//intro to the game
	public void menuIntro()
	{
		
	}
	
	//player guess locations
	public guess()
	{
		
	}
}
