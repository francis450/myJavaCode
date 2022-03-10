public class HumansTester {
	public static void main(String [] args){
		American fadu = new American();
		fadu.setHeight(150);
		fadu.setAge(21);
		fadu.setName("Francis");
		fadu.setGender("Male");

		fadu.getName();
		fadu.getAge();
		fadu.gender();
		fadu.race();
		fadu.blackType();
		fadu.getHeight();
	}
}