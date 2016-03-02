import java.util.*;

public class Game {
	protected int BATSHIP_NUM = 5;
	protected int DESTSHIP_NUM = 4;
	protected int SUB1_NUM = 3;
	protected int SUB2_NUM = 2;
	protected int PT_NUM = 1;

	public Game() {

		// Board gameBoard = new Board();
		// for some reason this thing goes batshit with exceptions if a player
		// is instantiated here for some reason
		// Player playerME = new Player(1);
	}

	/*
	 * Then I am not sure if there should be player classes constructed or not
	 * and if there are what should we call them/how should we assign them? Will
	 * a game just assign who is Player 1 or 2, or a different way? I
	 * instantiated one so we can have a player to use/call methods with for
	 * testing but not really sure how exactly to proceed there.
	 */
	// Player player1 = new Player();
	// Player player2 = new Player();

	// could make a zany option where the players can choose a larger or smaller
	// board by changing these ints, kids love zany things!
	private int rowTotal = 10;
	private int columnTotal = 10;
	// below is the game board
	private int[][] shipArray = new int[rowTotal][columnTotal];
	private int[][] shotArray = new int[rowTotal][columnTotal];
	private Random newRand = new Random();
	private int turnCount = 0;

	// flip a coin to see who starts
	public int coinFlip() {
		int retInt = 0;
		retInt = newRand.nextInt(2);
		return retInt;
	}

	// just the message to notify which player to begin
	public int playerStart() {
		int retInt;
		String retString = null;
		int coinLands = coinFlip();
		if (coinLands == 0) {
			retString = "Player 1 shall begin!";
			retInt = 1;
		} else {
			retString = "Player 2 shall begin!";
			retInt = 2;
		}
		System.out.println(retString);
		return retInt;
	}

	// intro message, self explanatory
	public String introMsg() {
		String retString = "WELCOME TO BATLSHIP FOR COMPUTER!!! \nADVENTURE ON THE HIGH SEAS AWAITS!!!";
		return retString;
	}

	public void populateShipBoard() {
		int i;
		int j;
		System.out.println("****YOUR****SHOTS******TAKEN*****ON****ENEMY******SHIPS*****");
		System.out.println("Hits are shown by the number 9");
		System.out.println("Misses are shown by the number 6");
		for (i = 0; i < rowTotal; i++) {
			for (j = 0; j < columnTotal; j++) {
				System.out.print(String.format("%3d", shipArray[i][j]));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("***YOUR*****SHIPS********ARE********BELOW*******");
		System.out.println("Battleship: " + BATSHIP_NUM);
		System.out.println("Destroyer: " + DESTSHIP_NUM);
		System.out.println("Submarine 1: " + SUB1_NUM);
		System.out.println("Submarine 2: " + SUB2_NUM);
		System.out.println("PT Boat : " + PT_NUM);
		for (i = 0; i < rowTotal; i++) {
			for (j = 0; j < columnTotal; j++) {
				System.out.print(String.format("%3d", shotArray[i][j]));
			}
			System.out.println();
		}
	}

	protected void runGame(Player anybodyA, Player anybodyB) {
		Player uno = anybodyA;
		Player dos = anybodyB;
		/*
		 * 
		 * uno = anybodyA; dos = anybodyB; } else { uno = anybodyA; dos =
		 * anybodyB; }
		 */
		introMsg();
		populateShipBoard();
		while (!uno.shipsFloatingList.isEmpty() || !dos.shipsFloatingList.isEmpty()) {
			int whoGoes = coinFlip();
			// this part in here needs work too, is too late and starting to not
			// make sense about who goes when
			int whoStarts = playerStart();
			if (whoStarts == 0) {
				// uno.takeShot(xCoord, yCoord);
				uno.goNowMessage();
			} else {
				// dos.takeShot(xCoord, yCoord);
				uno.waitMessage();
			}
			turnCount++;
			// inserted break below to prevent infinite loop when testing
			break;
		}
	}
}
