
public class SubShip extends Ships {
	public SubShip() {
		this.shipSize = 3;

	}

	public void hitMsg() {
		System.out.println("bbbwwwoooEEEE!!, bbbwwwoooEEEE!!, Ship class SUBMARINE has been hit!!!");
	}

	public void shooterSunkMsg() {
		System.out.println("You have sunk your opponent's SUBMARINE!!!");
	}

	public void admiralSunkMsg() {
		System.out.println("Your SUBMARINE has been scuttled to the briny deep!!!");
	}

}
