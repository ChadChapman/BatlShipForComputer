
public class PTBoat extends Ships {
public PTBoat(){
	this.shipSize = 2;
}

@Override
public void hitMsg() {
	// TODO Auto-generated method stub
	System.out.println("wwwweeeeOOOOO!!, wwwwwweeeeeOOOOOO!!, Ship class PTBOAT has been hit!!!");
	
}

@Override
public void shooterSunkMsg() {
	// TODO Auto-generated method stub
	System.out.println("You have sunk your opponent's PT BOAT!!!");
}

@Override
public void admiralSunkMsg() {
	// TODO Auto-generated method stub
	System.out.println("YouR PT BOAT has been scuttled to the briny deep!!!");
}

}
