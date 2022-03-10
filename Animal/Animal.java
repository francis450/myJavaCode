abstract public class Animal{

	public int limbs;
	public static String color;
	public static String name;
	public String myFood;

	public abstract void eat();
	
	public void walk(){
		System.out.println("I am Walking on "+limbs+"'s");
	}

	public void setLimbs(int legs){
		limbs = legs;
	}

	public int getLimbs(){
		return limbs;
	}

	public void setColor(String colour){
		color = colour;
	}

	public String getColor(){
		return color;
	}

	public void setFood(String food){
		myFood = food;
	}

	public String getFood(){
		return myFood;
	}

}