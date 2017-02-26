package cs455.scaling.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Server  implements Runnable{
	private static Server server = null;
	private  int thradPoolSize ;

	protected Server() {
	}

	public int getThradPoolSize() {
		return thradPoolSize;
	}

	public void setThradPoolSize(int thradPoolSize) {
		this.thradPoolSize = thradPoolSize;
	}

	public static Server getInsiance() {
		if (server == null) {
			server = new Server();

		} else {
			return server;
		}

		return server;

	}


	private static void intitalizeServer(int portNumber,int poolSize) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	// TODO Auto-generated method stub

	
	
	public static void main(String[] args) throws IOException {

		Server servernode = Server.getInsiance();
		
		final String EXIT_COMMAND = "exit";
		
		System.out.println("Enter port number and thread Pool size");

		boolean continueOperations = true;
		while (continueOperations) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String exitStr = br.readLine();
			System.out.println("Received command is:" + exitStr);

			if (EXIT_COMMAND.equalsIgnoreCase(exitStr)) {
				System.out.println("Exiting.");
				continueOperations = false;
			}
			else if(args.length >1)
			{
			 	int portnumber= Integer.parseInt(args[0]);
			 	int threadPoolSize= Integer.parseInt(args[1]);
		
			 	//intitalizeServer(portnumber,threadPoolSize);
			 	servernode.setThradPoolSize(threadPoolSize);			 	
				
				

			}
			
		}
		
		System.out.println("Bye.");

	}

}
