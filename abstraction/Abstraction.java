package abstraction;
abstract class Emp {
	abstract void work();
}
class Software extends Emp{
	void work() {
		System.out.println("Working");
	}
}
public class Abstraction {
	public static void main(String args[]) {
		Emp e=new Software();
		e.work();
	}

}
