import java.util.*;

public class GameHelper extends SimpleDotCom{
	Scanner input = new Scanner(System.in);
	public static void main(String [] args){
		//DECLARE an int varibale to keep track of number og user guesses
		int numOfGuesses = 0;

		//MAKE a new instance of SimpleDotCom
		GameHelper game = new GameHelper();

		//COMPUTE a random number btwn 0 and 4(it become starting location cell position)
		int rand = (int) (Math.random() * 5);

		//MAKE an int array of size three using the rand above
		int [] location = {rand,rand+1,rand+2};
				

		//INVOKE the setLocation() method on the game instance
		game.setLocation(location);

		//DECLARE a boolean variable to keep track of whether the Dot Com is Alive or not
		boolean isAlive = true;

		//WHILE the Dot Com is alive
		while(isAlive == true){
			//GET the user input
			String guess = game.getUserInput("Enter a number");
			
			//INVOKE the checkYourself() method
			String result = game.checkYourself(guess);

			//INCREMENT the number of guesses
			numOfGuesses++;

			//CHECK the users guess 
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took "+numOfGuesses+" guesses");
			}
		}
	}


	public String getUserInput(String message){
		System.out.println(message+": ");
		String num = input.next();
		//int nums = Integer.parseInt(num);

		return num;
	}
}