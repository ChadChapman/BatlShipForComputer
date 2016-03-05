
public class Destroyer extends Ships {
public Destroyer(){
	this.shipSize = 4;
}

@Override
public void hitMsg() {
	// TODO Auto-generated method stub
	System.out.println("bbbwwwoooEEEE!!, bbbwwwoooEEEE!!, Ship class DESTROYER has been hit!!!");

}

@Override
public void shooterSunkMsg() {
	// TODO Auto-generated method stub
	System.out.println("You have sunk your opponent's DESTROYER!!!");
}

@Override
public void admiralSunkMsg() {
	// TODO Auto-generated method stub
	System.out.println("YouR DESTROYER has been scuttled to the briny deep!!!");
}

}
