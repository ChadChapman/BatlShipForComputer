
abstract public class Ships extends Game {
	public Ships() {
	}

	protected int[] positionArray;
	protected int shipSize;
	protected boolean isSunk;
	protected int hitCount;
	//below is equivalent to the global variables from the super class here (5 = Battleship, etc)
	protected int shipID;

	public void checkStatus() {
		if (hitCount >= shipSize) {
			this.isSunk = true;
			//this.sunkMsg();
		} else {
			this.isSunk = false;
		}
	}

	public boolean checkShot(int[] shotArray){
		boolean isHit = false;
		for (int i=0; i<positionArray.length; i+=2){
			if (shotArray[0]==positionArray[i]){
				if (shotArray[1]==positionArray[i+1]){
					isHit = true;
					hitCount++;
					checkStatus();
				}
			}
		}return isHit;
	}

	public boolean isSunk(){
		return isSunk;
	}


	public void setPosArray(int element, int value){
		this.positionArray[element] = value;
	}

	public int[] getPosArray(){
		return positionArray;
	}
	
	abstract public void hitMsg();

	abstract public void shooterSunkMsg();

	abstract public void admiralSunkMsg();
}
