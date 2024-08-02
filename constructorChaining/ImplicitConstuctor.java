package constructorChaining;

public class ImplicitConstuctor {
	public static void main (String args[]) {
	new B();
	}
}
class A{
	A(){
		System.out.println("A is super class");
	}
}
class B extends A{
	B(){
		System.out.println("B is sub class of A");
	}
}