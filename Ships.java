
abstract public class Ships extends Game {
	public Ships() {

	}

	private Integer[] positionArray;
	protected int shipSize;
	private boolean isSunk = false;
	private int hitCount = 0;
	//below is equivalent to the global variables from the super class here (5 = Battleship, etc)
	private int idInt;

	public void checkStatus() {
		if (hitCount >= shipSize) {
			this.isSunk = true;
			//this.sunkMsg();
		} else {
			this.isSunk = false;
		}
	}
	
	public void setPosArray(int element, int value){
		this.positionArray[element] = value;
	}
	
	public Integer[] getPosArray(){
		return positionArray;
	}
//abstract public String sunkMsg();
}
