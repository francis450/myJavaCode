import java.util.*;

class Area{
	private int length;
	private int breadth;

	public void setDim(int l,int b){
		length = l;
		breadth = b;
	}	

	public int getArea(){
		int area = length * breadth;
		return area;
	}

	public static void main(String [] args){
		Area one = new Area();
		Scanner set = new Scanner(System.in);

		System.out.println("Enter the Length of the Rectangle: ");
		int l = set.nextInt();
		System.out.println("Enter the Breadth of the Rectangle: ");
		int b = set.nextInt();
		one.setDim(l,b);

		System.out.println("The area of the reactangle is: "+ one.getArea());
	}
}