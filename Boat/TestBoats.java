public class TestBoats extends SailBoat{

	public static void main(String [] args){
		Boat b1 = new Boat();
		SailBoat b2 = new SailBoat();
		RowBoat b3 = new RowBoat();

		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();

		System.out.println(b1.hashCode());//hashCode is a method in the Object superclass
		System.out.println(b2.getClass());// ''
		System.out.println(b3.toString());// ''
	}
}