import java.util.*;
public class Board extends Game {
public Board(){
	
}

int shipCount = 5;
int placementCounter = 0;

public void setShip(Ships anyShip){
	int placeSize = anyShip.shipSize;
	Random randGen1 = new Random();
	switch (placeSize):
		case: 2 {
			int anchorColumn = randGen1.nextInt(8);
			int anchorRow = randGen1.nextInt(8);
			int secondRow = anchorRow + 1;
			anyShip.setPosArray(0, anchorColumn);
			anyShip.setPosArray(1, anchorRow);
			anyShip.setPosArray(2, anchorColumn);
			anyShip.setPosArray(3, secondRow);
			break;
		}
		case: 3 {
			
		}
		case: 4{
			
		}
}
}
