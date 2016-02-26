import java.util.*;

public class Player extends Game {
	public Player() {

	}

	public Player(int playerNum) {
		whichPlayer = playerNum;
	}

	private int whichPlayer;
	//hav an AList here to store ship names still afloat for easy access
	//checking the size of this or the names may prove useful but not sure yet.  better data struct to use here?
	ArrayList<Ships> shipFloatingList = new ArrayList<>();

	public String goNextMesage() {
		String retString = "Player: " + Integer.toString(whichPlayer) + " IT IS YOUR SHOT!";
		return retString;
	}

	public int[] takeShot(int xCoord, int yCoord) {
		/*
		 * In this method I think we could take in either the keyboard or the
		 * GUI input as the coords for the shot a player wants to take and then
		 * return them as a 2-element array. I am unsure how else to return
		 * multiple ints from a single method.
		 */
		
		int[] retArray = new int[2];
		retArray[0] = xCoord;
		retArray[1] = yCoord;
		return retArray;
	}
	
	public boolean checkShot(int[] shotArray){
		boolean isAHit = false;
		int xCoord = shotArray[0];
		int yCoord = shotArray[1];
		for (Ships s : shipFloatingList){
			int [] shipCoords = s.getPosArray();
			int lenf = shipCoords.length;
			int coordsChecked = 0;
			//so here I am going into a for loop to go through and check each coordinate
			//pair for each ship, comparing the shotArray to the ships' position array.
			while (coordsChecked < lenf/2){
				
				coordsChecked++;
			}
			
			if (){
				
			}
		}
		return isAHit;
	}
}
