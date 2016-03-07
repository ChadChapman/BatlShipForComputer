import java.net.*;
import java.io.*;

public class Server {
	public static final int LISTENING_PORT = 32007;

	public static void main(String[] args) {
		while(true){
			Server server = new Server();
		}
	}

	public Server(){
		ServerSocket listener; 
		Socket connection1=null;
		Socket connection2=null; 
		try {
			listener = new ServerSocket(LISTENING_PORT);
			System.out.println("Listening on port " + LISTENING_PORT);
			while (connection1==null||connection2==null){
				if (connection1!=null){
					connection2 = listener.accept();
					System.out.println("Player2 connected");
				}else{
					connection1 = listener.accept();
					System.out.println("Player1 connected");
				}
			}
		}catch (Exception e) {
			System.out.println("Sorry, the server has shut down.");
			System.out.println("Error: " + e);
			return;
		}
		while (connection1.isClosed()!=true&&connection2.isClosed()!=true){
			playGame(connection1, connection2);
		}
	}

	public static void playGame(Socket player1, Socket player2){
		BufferedReader input1, input2;
		PrintWriter output1, output2;
		try {
			input1 = new BufferedReader(
					new InputStreamReader(player1.getInputStream()));
			input2 = new BufferedReader(
					new InputStreamReader(player2.getInputStream()));
			output1 = new PrintWriter(player1.getOutputStream());
			output2 = new PrintWriter(player2.getOutputStream());

			while (player1.isClosed()!=true&&player2.isClosed()!=true){
				if (input1.ready()){
					String shot = input1.readLine();
					output2.println(shot);
					output2.flush();
				}
				if (input2.ready()){
					String shot = input2.readLine();
					output1.println(shot);
					output1.flush();
				}
			}
			System.out.println("Disconnected!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


