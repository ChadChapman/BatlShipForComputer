
public class shipTest {

	public static void main(String[] args) {
		int[] subPos = new int[]{1,1,2,1,3,1}; 
		Ships sub = new SubShip(subPos);
		int[] shotArray = new int[]{1,1};
		System.out.println(sub.checkShot(shotArray));
		shotArray = new int[]{2,1};
		System.out.println(sub.checkShot(shotArray));
		System.out.println("Sunk?"+sub.isSunk());
		shotArray = new int[]{3,1};
		System.out.println(sub.checkShot(shotArray));
		System.out.println("Sunk?"+sub.isSunk());
	}

}
