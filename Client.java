import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	public static final int LISTENING_PORT = 32007;
	private BufferedReader incoming;
	private PrintWriter outgoing;

	public Client(){
		connect();
	}

	/** This is just for testing. */
//	public static void main(String[] args) {
//		Client client = new Client();
//		String[] shot = new String[2];
//		shot[0]="A";
//		shot[1]="10";
//		client.sendShot(shot);
//		while(true){
//			client.receiveShot();
//		}
//	}

	public void connect(){
		Socket server;
		String hostName;

		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter host name or IP address: ");
		hostName = stdin.nextLine();
		try {
			server = new Socket( hostName, LISTENING_PORT );
			incoming = new BufferedReader(
					(new InputStreamReader(server.getInputStream())));
			outgoing = new PrintWriter(server.getOutputStream());
			System.out.println("Connected");
		}catch (Exception e) {
			System.out.println("Error: " + e);
		}
		stdin.close();
	}

	/** This will send the shot to the server for routing.
	 * @param shot	An array of Strings representing a grid location.
	 */
	public void sendShot(String[] shot){
		for (String shotPart: shot){
			outgoing.println(shotPart);
			outgoing.flush();
		}
	}

	/** This will receive a shot from the server and return 
	 * an array of Strings representing a grid location.
	 */
	public String[] receiveShot(){
		String[] shot = new String[2];
		boolean shotReceived = false;
		while (shotReceived==false){
			try {
				if (incoming.ready()==true){
					System.out.println("Incoming");
					for(int i=0; i<shot.length; i++){
						shot[i] = incoming.readLine();
					}
					shotReceived = true;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**Just for testing */
//		for(String shotPart: shot){
//			System.out.println("Received="+shotPart);
//		}
	return shot;
	}
}
