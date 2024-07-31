package polymorphisam;

public class Narrow {
	 static int a=10;
	 static double b=a;
	 static int c=(int)b;
	public static void main(String args[]) {
		System.out.println(b);
		System.out.println(c);
	}

}
