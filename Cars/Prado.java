public class Prado{
	public static void main(String args[]){
		SaloonCar diff = new SaloonCar(Prado);
		System.out.println("Value of wheels is : "+diff.wheels);
		System.out.println("Value of cc is: "+diff.cc);
		System.out.println("Value of color is "+diff.color);
		System.out.println("Value of seats is "+diff.seats);
		System.out.println("Value of fuel is "+diff.fuel);
		diff.moveFoward ();
	}
}

