public class Toyota extends SaloonCar{
	public static void main(String args[]){
		SaloonCar obj = new SaloonCar("Toyota");

		System.out.println("Value of wheels is : "+obj.wheels);
		
		System.out.println("Value of cc is: "+obj.cc);
		
		System.out.println("Value of color is "+obj.color);
		
		System.out.println("Value of seats is "+obj.seats);
		
		obj.moveFoward ();
	}
}