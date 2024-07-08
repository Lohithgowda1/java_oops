package inheritance;
class X{
	void show() {
		System.out.println("hello");
	}
}
class Y extends X{
	void show() {
		super.show();
		System.out.println("hii");
		
	}
}
public class Super {
	 public static void main(String args[]) {
		 Y b=new Y();
		 b.show();
	 }

}
