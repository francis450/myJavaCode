import java.util.Scanner;

public class GoodDogTestDrive extends GoodDog{

	public static void main(String [] args){
		int x, y;
		GoodDog one = new GoodDog();
		//Scanner x = new Scanner();
		Scanner.in(x);
		one.setSize(x);
		GoodDog two = new GoodDog();
		two.setSize(8);
		System.out.println("Dog one: "+ one.getSize());
		System.out.println("Dog two: "+two.getSize());

		one.bark();
		two.bark();
	}
}