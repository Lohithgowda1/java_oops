package basicjavaprogramm;

public class Methodoverloading {
	void display(int a) {
		System.out.println(a);
	}
	void display(double a) {
		System.out.println(a);
	}
	public static void main(String args[]) {
		Methodoverloading me=new Methodoverloading();
		me.display(5);
		me.display(5.4);
		me.main(4);
	}
	public static void main(int a ) {
		System.out.println("a");
	}

}
