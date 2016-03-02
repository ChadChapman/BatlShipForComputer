
public class MethodShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Game newGame = new Game();
//newGame.populateShipBoard();
Player newGuy = new Player(1);
Player oldGuy = new Player(2);
//newGuy.goNowMessage();
//oldGuy.waitMessage();
//newGame.populateShotBoard();
newGame.runGame(newGuy, oldGuy);

	}

}
