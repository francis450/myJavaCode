public class GoodDog{
	private int size;

	public int getSize(){
		return size;
	}

	public void setSize(int s){
		if(s > 0){
			size = s;
		}else{
			System.out.println("Invalid size!!!");
		}
	}

	public void bark(){
		if(size > 60){
			System.out.println("Wooof! Woof!");
		}else if(size > 14){
			System.out.println("Ruff!! Ruff!!");
		}else{
			System.out.println("Yip! Yip!");
		}
	}
}