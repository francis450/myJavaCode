public class PhraseMatic{
	public static void main(String [] args){
		//three sets of words to choose from
		String [] words1 = {"lambistic","happy","gorgeus","adorable","mighty","fast","smart"};
		String [] words2 = {"networked","cooperative","hardworking","self-driven","leveraged"};
		String [] words3 = {"process","guy","lady","boy","lecturer","student"};

		//the size of each of the arrays
		int size1 = words1.length;
		int size2 = words2.length;
		int size3 = words3.length;

		//generating three random numbers using the array sizes
		int rand1 = (int) (Math.random() * size1);//(int) -> Its called a cast.used to force the type into integer
		int rand2 = (int) (Math.random() * size2);
		int rand3 = (int) (Math.random() * size3);

		//creating a phrase
		String phrase = words1[rand1] +" "+ words2[rand2]+" "+words3[rand3];

		System.out.println("What we need is a "+phrase);
	}
}