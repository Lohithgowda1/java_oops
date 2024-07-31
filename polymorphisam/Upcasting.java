package polymorphisam;

class Emp{
	int a=5;
	
}
class Sub extends Emp{
	int b=10;
	
}
public class Upcasting {
	public static void main(String args[]) {
		Emp e=new Sub();
		System.out.println(e.a);
		
	}

}
