import java.util.*;
 
class ExampleTest extends Example1{

	public static void main(String[] args){
		Example1 one = new Example1();
		Example1 two = new Example1();

		ArrayList <Example1> myList = new ArrayList <Example1>();
		myList.add(one);
		myList.add(two);

		System.out.println(myList.size());

		Example1 yoh = myList.get(1);
		yoh.getYork(34);

		System.out.println(yoh.setYork());



	}
}