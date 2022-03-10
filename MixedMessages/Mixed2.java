public class Mixed2 extends C{

	public static void main(String [] args){
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();//polymorphism

		c.m1();
		c.m2();
		c.m3();

	}
}