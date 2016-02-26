import java.util.*;

public class Game {
	public Game() {


	}
	//Player player1 = new Player();
	//Player player2 = new Player();
	//Board gameBoard = new Board();
	
	private ArrayList<int[]> gameArray = new ArrayList<int[]>();
	private Random newRand = new Random();

	public int coinFlip() {
		int retInt = 0;
		retInt = newRand.nextInt(2);
		return retInt;
	}

	public String playerStart() {
		String retString = null;
		int coinLands = coinFlip();
		if (coinLands == 0) {
			retString = "Player 1 shall begin!";
		} else {
			retString = "Player 2 shall begin!";
		}
		return retString;
	}
	
	public String introMsg(){
		String retString = "WELCOME TO BATLSHIP FOR COMPUTER!!! \nADVENTURE ON THE HIGH SEAS AWAITS!!!";
		return retString;
	}

}
