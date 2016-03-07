import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//This class isn't completely implemented into the project yet i had to use a lot of test code.

public class Controller extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	public static int[][]arrayList = new int[10][10];
	

 
	//Controller buttons
	
	
	public String[] rowLabels = {"A","B","C","D","E","F","G","H","I","J"};
	public String[] colsLabels = {"1","2","3","4","5","6","7","8","9","10"};
	JButton button[][] = new JButton[10][10];
	
	private JTextField display = new JTextField("");
	
	//Constructor for the Controller
	public Controller(){
		setLayout (new BorderLayout());
		display.setEditable(false);
		add(display, "South");
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(10,10));
		
		// Generates the Controller buttons onto the Grid		
		for(int row = 0; row < 10; row++){
			for(int col = 0; col < 10; col++){
			button[row][col] = new JButton(rowLabels[row]+colsLabels[col]);
			panel.add(button[row][col]);
			button[row][col].addActionListener(this);
			}
		}
		add(panel,"Center");
		
		
	}
	
	public static void main(String[] args) {
		
		
		JFrame frame = new Controller();
		frame.setTitle("BattleShip");
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	
		frame.setVisible(true);

	}

	public Point getButtonCoords(JButton buttons){
		for(int row = 0; row < button.length; row++){
			for(int col = 0; col < button[0].length; col++){
				if(buttons == button[row][col])
					return new Point(row,col);
			}
		}
			return null;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttons = (JButton) event.getSource();	
		Point shot = getButtonCoords(buttons);
		int row = shot.y;
		int col = shot.x; 
		// col = x coord row = y coord
		takeShot(col,row);
		display.setText("Firing le Missile" + buttons.getText());
		
	}
// This is the function to star the color update.
	//	public void shotUpdate(int col, int row){
//		if()
		
		
//	}
	
	// this function was imported for debugging purposes still working on debugging.
	public boolean takeShot(int xCoord, int yCoord) {
		/*
		 * In this method I think we could take in either the keyboard or the
		 * GUI input as the coords for the shot a player wants to take and then
		 * return them as a 2-element array. I am unsure how else to return
		 * multiple ints from a single method.
		 * 
		 * Here is the info to take through the Socket and relay to the other
		 * player
		 */
		Integer board[][] = new Integer[10][10];
		board[0][0] = 4;
		board[10][10] = 5;
		board[5][5] = 4;
		board[4][5] = 1;
		board[5][4] = 3;
	//	Integer[] retArray = new Integer[2];
	//	retArray[0] = xCoord;
	//	retArray[1] = yCoord;
	//	return retArray;
		if(board[xCoord][yCoord] == null){
			return false;
		}else{
			return true;
		}
		
		
	}

}
