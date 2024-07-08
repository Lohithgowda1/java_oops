package inheritance;
class A{
	void showA() {
		System.out.println("A is super class");
	}
}
class B extends A{
	void ShowB() {
		System.out.println("B is sub class of A");
	}
}
class C extends A{
	void ShowC() {
		System.out.println("C is sub class of A");
	}
}

public class Hirearchical {
	public static void main(String args[]) {
		B obj1=new B();
		C obj2=new C();
		obj1.showA();
		obj1.ShowB();
		obj2.showA();
		obj2.ShowC();
	}

}
