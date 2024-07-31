package polymorphisam;

class Emplo{
	int a=5;
}
class Empson extends Emplo{
	int b=2;
}
public class Downcasting {
	public static void main(String args[]) {
		Emplo e=new Empson();
		Empson s=(Empson) e;
		System.out.println(e.a);
		System.out.println(s.a);
		System.out.println(s.b);
	}

}
