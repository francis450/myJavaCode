public class SimpleDotCom{
	private int [] locationCells;
	private int numOfHits;

	public String checkYourself(String userGuess){
		//CONVERT the user guess into an int
		int guess = Integer.parseInt(userGuess);

	}

	void setLocation(int [] loc){
		for(int i=0;i<locationCells;i++){
			locationCells[i] = loc[i];
		}
	}

}