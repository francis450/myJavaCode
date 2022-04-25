public class SimpleDotComGame{
	public static void main(String [] args){
		//Instantiate a simpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();

		//Assign it a location(an array of 3 ints)
		int [] location = {2,3,4};

		//Use the fake location to setLocation() setter
		dot.setLocation(location); 	

		//create a String to represent user guess
		String guess = "4";

		//Invoke the checkYourself method passing in the fake guess
		String result = dot.checkYourself(guess);

		// String testResult;
		// if(result.isequal("hit")){
		// 	testResult = "passed";
		// }

		//sSystem.out.println(result);
	}
}