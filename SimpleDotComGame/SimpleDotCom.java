class SimpleDotCom{
	private int [] locationCells;
	private int numOfHits = 0;
	
	public void setLocation(int [] loc){
		locationCells = loc;
	}

	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result ="miss";

		for(int cell : locationCells){
			if(guess  == cell){
				result = "hit";
				numOfHits++;
				//Since we already got a hit there is no need to test the other classes
				break;
			}
		}
		if(numOfHits  == locationCells.length){
			result = "kill";
		}

		System.out.println(result);
		return result; 
	}
}