
public class BattleShip extends Ships {
	public BattleShip() {
this.shipSize = 5;
	}

	@Override
	public void hitMsg() {
		// TODO Auto-generated method stub
		System.out.println("aaaaooooGGGGAAAA!!, aaaaooooGGGGGAAAAA!!, Ship class BATTLESHIP has been hit!!!");

	}

	@Override
	public void shooterSunkMsg() {
		// TODO Auto-generated method stub
		System.out.println("You have sunk your opponent's BATTLESHIP!!! GAME OVER YOU ARE THE MASTER AND COMMANDER OF THE HIGH SEAS!!!");

	}

	@Override
	public void admiralSunkMsg() {
		// TODO Auto-generated method stub
		System.out.println("Your BATTLESHIP has been sunk!!! GAME OVER!!!");

	}
	
		
	

}
