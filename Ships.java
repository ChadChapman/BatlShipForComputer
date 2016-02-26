
abstract public class Ships extends Game {
	public Ships() {

	}

	private int[] positionArray;
	protected int shipSize;
	private boolean isSunk = false;
	private int hitCount = 0;
	private int idInt;

	public void checkStatus() {
		if (hitCount >= shipSize) {
			this.isSunk = true;
			this.sunkMsg();
		} else {
			this.isSunk = false;
		}
	}
	
	public void setPosArray(int element, int value){
		this.positionArray[element] = value;
	}
abstract public String sunkMsg();
}
