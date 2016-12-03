/*Main file to run the game.  
 * This will call the actiongame.java file to run.*/
import java.util.Scanner;

public class battleship
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		actiongame game = new actiongame();
		game.runGame();
		
	}
}
