public class PhaseOMatic{

	public static void main(String[] args){
		String[] wordlistOne = {"24/7","multiTier","30,000 foot","B-to-B",
		"win-win","frontend", "web-based","pervasive",
		"smart", "sixsigma","critical-path", "dynamic"};

		String[] wordListTwo = {"empowered", "sticky",
			"value-added", "oriented", "centric", "distributed",
			"clustered", "branded","outside-the-box", "positioned",
			"networked", "focused", "leveraged", "aligned",
			"targeted", "shared", "cooperative", "accelerated"};

		String[] wordListThree = {"process", "tippingpoint", "solution", 
			"architecture", "core competency","strategy", "mindshare", 
			"portal", "space", "vision","paradigm","mission"};

		//Find How many words are in each list
			int oneLength = wordlistOne.length;
			int twoLength = wordListTwo.length;
			int threeLength = wordListThree.length;

		//Generate three random numbers
			int rand1 = (int) (Math.random() * oneLength);
			int rand2 = (int) (Math.random() * twoLength);
			int rand3 = (int) (Math.random() * threeLength);
		//Build a Phrase 
			String phrase = wordlistOne[rand1]+ " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		//Print out the phrase
			System.out.println("What we need is a "+ phrase);

	}
}