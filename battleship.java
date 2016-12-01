/*Main file to run the game.  
 * This will call the actiongame.java file to run.*/
<code>import java.util.Scanner;

public class battleship
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		actiongame game = new actiongame();
		gameboard board = new gameboard();
		game.menuIntro();
		board.printBoard();
		
	}
}
</code>
