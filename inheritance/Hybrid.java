package inheritance;
class Vegetable{
	public void veg() {
		System.out.println("vegetable is good for the health");
	}
}
class carrot extends Vegetable {
	public void carr() {
		System.out.println("Carrot is good for the eye");
	}
}
class beetroot extends Vegetable {
	public void beet() {
		System.out.println("It is good for the heart");
	}
}
class tomato extends carrot{
	public void tom() {
		System.out.println("it is also good for the heart");
	}
}
public class Hybrid {
	public static void main(String args[]) {
		Vegetable v=new Vegetable();
		carrot c=new carrot();
		beetroot b=new beetroot();
		tomato t=new tomato();
		v.veg();
		c.veg();
		c.carr();
		b.veg();
		b.beet();
		t.veg();
		t.carr();
	}
}
