import java.util.*;

public class Player extends Game {
	public Player() {

	}
/*
 * here is the constructor for the player class
 * I have it set up to take an int to make it easy to differentiate who is player 1 or player 2
 * This will set the player's number and also the other player's so it can be set here and minimize the 
 * need for communication between the players and their info
 * 
 * I also thought it may be best to instantiate the ships here since each player will have their own
 * I then added all new ships to an array list consisting of the ships this player currently has floating
 * After each type of ship is sunk, it will be removed from the list, then when the shipsFloatingList
 * is 0 for one of the players, the game is over.
 * 
 * @Brent will mainly want to look at the takeShot() method right now as it will return the Integer[]
 * needed for sending shot coords to the other player to check.  
 * The checkShot() still needs some work to verify hits/misses but it will return a boolean as you can see
 * 
 * @Chris will want to check out the populateShipCoords() for the GUI sending an array of ints/Integers for
 * each ship's coord array.  I think it would be easiest to make either the first or last number in the 
 * coord array one of the global varaible ints found in the Game class to denote which of the ships is
 * using that particular coord array.
 * For example, a PT Boat with the coords (4,3)and(4,4) may have a 1 placed at the beginning of the array.
 * So a PT Boat array may look something like [1, 4, 3, 4, 4].
 * This way we always know the identifying int is at the beginning of the array and don't have to guess/algo
 * where to put it for each boat.  Then we just begin iterating over the [1] element as the x-coord in each array
 * in the list when checking against the shot-coordinates.
 */
	public Player(int playerNum) {
		thisPlayer = playerNum;
		setOtherPlayer();
		PTBoat ptShip = new PTBoat();
		SubShip subShip1 = new SubShip();
		SubShip subShip2 = new SubShip();
		Destroyer destShip = new Destroyer();
		BattleShip batShip = new BattleShip();
		shipsFloatingList.add(ptShip);
		shipsFloatingList.add(subShip1);
		shipsFloatingList.add(subShip2);
		shipsFloatingList.add(destShip);
		shipsFloatingList.add(batShip);
		populateShipsCoords();
	}

	private int thisPlayer;
	private int otherPlayer;
	// hav an AList here to store ship names still afloat for easy access
	// checking the size of this or the names may prove useful but not sure yet.
	// better data struct to use here?
	public ArrayList<Ships> shipsFloatingList = new ArrayList<>();
	private ArrayList<Integer[]> shipsCoordsList = new ArrayList<>();
	
	private void populateShipsCoords(){
		for (Ships s : shipsFloatingList){
			Integer[] shipPosition = s.getPosArray();
			shipsCoordsList.add(shipPosition);
		}
	}
	
	private void setOtherPlayer() {
		if (thisPlayer == 1) {
			otherPlayer = 2;
		} else {
			otherPlayer = 1;
		}
	}
	
	int getThisPlayer(){
		return thisPlayer;
	}

	public void goNowMessage() {
		System.out.println("Player: " + Integer.toString(thisPlayer) + " IT IS YOUR SHOT!");
	}

	public void waitMessage() {
		System.out.println(
				"Player: " + Integer.toString(thisPlayer) + "***** PLAYER " + otherPlayer + " IS FIRING AT YOU!!!");
	}

	public Integer[] takeShot(int xCoord, int yCoord) {
		/*
		 * In this method I think we could take in either the keyboard or the
		 * GUI input as the coords for the shot a player wants to take and then
		 * return them as a 2-element array. I am unsure how else to return
		 * multiple ints from a single method.
		 * 
		 * Here is the info to take through the Socket and relay to the other player
		 */

		Integer[] retArray = new Integer[2];
		retArray[0] = xCoord;
		retArray[1] = yCoord;
		return retArray;
	}

	public boolean checkShot(int[] shotArray) {
		boolean isAHit = false;
		int xCoord = shotArray[0];
		int yCoord = shotArray[1];
		for (Ships s : shipsFloatingList) {
			if (s.checkShot(int[] shotArray)==true){	//This is what I was trying to explain
				isAHit = true;				//the other day. You get polymorphism and
			}						//simpler code. -Brent
		}
		return isAHit;	
			
			Integer[] shipCoords = s.getPosArray();
			int lenf = shipCoords.length;
			int coordsChecked = 0;
			// so here I am going into a for loop to go through and check each
			// coordinate
			// pair for each ship, comparing the shotArray to the ships'
			// position array.
			/*
			 * and this is where I ended for the night.  I am going to need to work this method to 
			 * check the opposing takeShot() Integer[]
			 * It should also check each ship's isFloating() method and then remove any sunk ships and display
			 * an appropriate message if needed.
			 * will probably start cheking at index [1] for x-coord matches then move through with some x%2=1
			 * logic 
			 */
			while (coordsChecked < lenf / 2) {

				coordsChecked++;
			}

		}

		return isAHit;
	}
}
