abstract class Human implements Gender{
	private String names;
	private String gender;
	private int height;
	private int age;

	public void setName(String name){
		names = name;
	}

	public String getName(){
		System.out.println("My name is "+names);
		return "";
	}

	abstract public void race();
	public void setGender(String sex){
		if(sex == "Female" || sex == "Male" || sex == "Rather Not Say"){
			gender = sex;
		}else{
			System.out.println("Invalid gender!!");
		}
	}

	// public String getRace(){
	// 	return race;
	// }

	public void setHeight(int h){
		if(h > 10){
			height = h;
		}else{
			System.out.println("Invalid height");
		}
	}

	public int getHeight(){
		System.out.println("I am " + height + " centimeters tall");
		return height;
	}

	public void setAge(int a){
		if(a >= 0 ){
			age = a;
		}else{
			System.out.println("Invalid age");
		}
	}

	public void getAge(){
		System.out.println("I am "+ age +" years old" );
	}

	public void gender(){
		if(gender == "Female" || gender == "Male"){
			System.out.println("I am a "+ gender);
		}else{
			System.out.println("I would rather not say!!");
		}
	}

}